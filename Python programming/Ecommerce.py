# Read inputs
age = 14
total_price = 5000

price_after_discount = total_price

# Apply discount based on age
if 13 <= age <= 19:
    # Apply 5% flat discount
    price_after_discount = total_price - (total_price * 0.05)

    # Apply additional 5% if price after discount > 5000
    if price_after_discount > 5000:
        price_after_discount -= price_after_discount * 0.05

elif 20 <= age <= 29:
    # Apply 6% flat discount
    price_after_discount = total_price - (total_price * 0.06)

    # Apply additional 6% if price after discount > 4000
    if price_after_discount > 4000:
        price_after_discount -= price_after_discount * 0.06

elif age > 29:
    # Apply 15% flat discount
    price_after_discount = total_price - (total_price * 0.15)

# Display outputs
print("Total Price Before Discount:", total_price)
print("Total Price After Discount:", price_after_discount)
print("Discounted Amount:", total_price - price_after_discount)
