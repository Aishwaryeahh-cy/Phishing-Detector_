# Phishing URL Detector - Beginner Friendly Python Version

# List of suspicious phishing keywords
phishing_keywords = ["login", "verify", "update", "secure", "account", "bank", "free", "urgent"]

# Ask user to enter URL
url = input("Enter the URL to check: ").strip().lower()

# Assume safe first
is_phishing = False

# Check if any keyword is in the URL
for keyword in phishing_keywords:
    if keyword in url:
        is_phishing = True
        break

# Print result
if is_phishing:
    print("⚠️ Warning: This URL may be a phishing attempt! Be aware.")
else:
    print("✅ This URL seems safe.")
