# Phishing URL Detector

phishing_keywords = ["login", "verify", "update", "secure", "account", "bank", "free", "urgent"]

url = input("Enter the URL to check: ").strip().lower()

is_phishing = False

for keyword in phishing_keywords:
    if keyword in url:
        is_phishing = True
        break

if is_phishing:
    print("⚠️ Warning: This URL may be a phishing attempt! Be aware.")
else:
    print("✅ This URL seems safe.")
