# pseudo_code_executor
One of the problems that is faced in real time code checking on server is accidental infinite-loops or the deadlier infinite recursion.
there is no way to determine logical errors that might cause infinite looping but accidents like <br>
->missing increment statement in loops(for/while)<br>
->forgetting to provide base condition in recursion<br>
->non-converging base condition<br>
->loop without condition <br>
->non-converging loop condition<br>
can be dealt with thus reducing long debugging hours<br>

## Pseudo_code_executor
reads through the code understanding loop and non loop statements analysing them as to where such problems can occur and whether it has occured or not, pin pointing the position where correction needs to be made and suggesting the correction

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Licenses
MIT License

Copyright (c) [2019] [Abhishek Sen]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
