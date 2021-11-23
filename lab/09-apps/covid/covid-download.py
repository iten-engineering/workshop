from io import BytesIO
from zipfile import ZipFile
from urllib.request import urlopen
import zipfile


# url = "https://www.covid19.admin.ch/api/data/20210924-5fy7avyv/downloads/sources-json.zip"
url = "https://www.covid19.admin.ch/api/data/20211123-pe19bglf/downloads/sources-json.zip"

def download_and_unzip(url, extract_to="."):
    http_response = urlopen(url)
    zip = ZipFile(BytesIO(http_response.read()))
    zip.extractall(path = extract_to)

download_and_unzip(url)
