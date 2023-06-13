
package refactor;
public class Sort {
int a;
int b;
int c;
public void ascSort() {
if (a > b) {
int temp = a;
a = b;
b = temp;
}
if (a > c) {
int temp = a;
a = c;
c = temp;
}
if (b > c) {
int temp = b;
b = c;
c = temp;
}
}}