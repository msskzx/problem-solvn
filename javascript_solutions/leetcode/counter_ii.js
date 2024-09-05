// https://leetcode.com/problems/counter-ii/
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let cur = init;
    return {
        reset: () => {
            cur = init;
            return cur;
        },
        increment: () => {
            ++cur;
            return cur;
        },
        decrement: () => {
            --cur;
            return cur;
        },
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */