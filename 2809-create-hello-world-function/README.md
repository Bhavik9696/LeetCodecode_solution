<h2><a href="https://leetcode.com/problems/create-hello-world-function">2809. Create Hello World Function</a></h2><h3>Easy</h3><hr>Write a function <code>createHelloWorld</code>. It should return a new function that always returns <code>"Hello World"</code>.
<p> </p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> args = []
<strong>Output:</strong> "Hello World"
<strong>Explanation:</strong>
const f = createHelloWorld();
f(); // "Hello World"

The function returned by createHelloWorld should always return "Hello World".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> args = [{},null,42]
<strong>Output:</strong> "Hello World"
<strong>Explanation:</strong>
const f = createHelloWorld();
f({}, null, 42); // "Hello World"

Any arguments could be passed to the function but it should still always return "Hello World".
</pre>

<p> </p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 <= args.length <= 10</code></li>
</ul>
