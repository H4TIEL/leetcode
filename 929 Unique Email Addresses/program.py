from typing import List


def num_unique_emails(emails: List[str]) -> int:
    addresses = set()
    for email in emails:
        local_name, domain_name = email.split('@')
        local_name = local_name.replace('.', '')
        if '+' in local_name:
            local_name, _ = local_name.split('+', 1)
        address = local_name + '@' + domain_name
        addresses.add(address)
    return len(addresses)
