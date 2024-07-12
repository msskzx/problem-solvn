def stab_matrix(matrix, n, m):
    for i in range(n):
        for j in range(m):
            # check if cell is greater than all neighbors if x and y are within bounds
            dirs = [(0, 1), (0, -1), (1, 0), (-1, 0)]
            flags = []
            min_neighbor = int(1e9)
            for dx, dy in dirs:
                x, y = i + dx, j + dy
                if 0 <= x < n and 0 <= y < m:
                    if matrix[i][j] > matrix[x][y]:
                        min_neighbor = min(matrix[x][y], min_neighbor)
                        flags.append(True)
                    else:
                        flags.append(False)
                else:
                    flags.append(True)

            if all(flags):
                # set to min of all neighbors
                matrix[i][j] = min_neighbor
                stab_matrix(matrix, n, m) # recheck the matrix after the change
    
    return matrix
    

def main():
    t = int(input().strip())
    for _ in range(t):
        n, m = map(int, input().strip().split())
        matrix = []
        for _ in range(n):
            matrix.append(list(map(int, input().strip().split())))
        res = stab_matrix(matrix, n, m)
        for row in res:
            print(" ".join(map(str, row)))
    
if __name__ == "__main__":
    main()