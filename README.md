## Sum Odd

### Description

Write a method called <b>isOdd</b> with an <b>int</b> parameter and call it <b>number</b>. The method needs to return a <b>boolean</b>. Check that number is > 0, if it is not return <b>false</b>. If number is odd return <b>true</b>, otherwise return <b>false</b>.

Write a second method called <b>sumOdd</b> that has 2 int parameters <b>start</b> and <b>end</b>, which represent a range of numbers. The method should use a for loop to sum all odd numbers in that range including the end and return the sum. It should call the method <b>isOdd</b> to check if each number is odd. The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0. If those conditions are not satisfied return -1 from the method to indicate invalid input.


### Examples of input/output

<ul>
<li>sumOdd(1, 100); → should return 2500</li>
<li>sumOdd(-1, 100); → should return -1</li>
<li>sumOdd(100, 100); → should return 0</li>
<li>sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)</li>
<li>sumOdd(100, -100); → should return -1</li>
<li>sumOdd(100, 1000); → should return 247500</li>
</ul>
