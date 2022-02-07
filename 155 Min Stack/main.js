class MinStack {
  stack = [];

  constructor() {}
  /**
   * @param {number} val
   * @return {void}
   */
  push(val) {
    this.stack.push(val);
  }
  /**
   * @return {void}
   */
  pop() {
    this.stack.pop();
  }
  /**
   * @return {number}
   */
  top() {
    const length = this.stack.length;
    return this.stack[length - 1];
  }
  /**
   * @return {number}
   */
  getMin() {
    return this.stack.reduce((minimum, current) => 
      current < minimum ? minimum = current : minimum = minimum
    , Infinity);
  }
}

let obj = new MinStack();
obj.push(1);
obj.push(2);
obj.push(3);
obj.pop();
let param_3 = obj.top();
let param_4 = obj.getMin();
console.log({ param_3 });
console.log({ param_4 });


var MinStack = function() {
    let stack = [];    
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    MinStack.stack.push(val);
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    this.stack.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    const length = this.stack.length;
    return this.stack[length - 1];
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.stack.reduce((minimum, current) => 
      current < minimum ? minimum = current : minimum = minimum
    , Infinity);
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
