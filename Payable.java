/** Group7: Francis & Gustavo
* File: Lab5b.java
* Description: ENUM
* Lessons Learned: Enum helps us with constructors, adding variables, instances, and even implementing interfaces.
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/

package DessertShop;

public interface Payable {
enum PayType
{
CASH,
CARD,
PHONE;
}

public PayType getPayType();

public void setPayType(PayType payType);

}

