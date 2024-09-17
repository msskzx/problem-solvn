class Node:
  def __init__(self, score):
    self.score = score
    self.parent = None
    self.children = []
    self.totalScore = 0

  def addChild(self, child):
    child.parent = self
    self.children.append(child)
    
  def setScore(self, newScore):
    p = self.parent
    diff =  newScore - self.score
    while p:
        p.totalScore += diff
        p = p.parent
    self.score = newScore
    self.totalScore += diff

  def calculateTotalScore(self):
    if not self:
        return 0
    if self.totalScore > 0:
        return self.totalScore
    res = self.score
    for c in self.children:
        res += c.calculateTotalScore()
    self.totalScore = res
    return res