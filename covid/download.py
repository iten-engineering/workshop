from io import BytesIO
from zipfile import ZipFile
from urllib.request import urlopen

# Install zipfile;
# - pip install zipfile36
# - Details: https://pypi.org/project/zipfile36/

url = "https://www.covid19.admin.ch/api/data/20210510-cfeld8mz/downloads/sources-json.zip"
path = "./covid"

def download_and_unzip(url, extract_to='.'):
    http_response = urlopen(url)
    zipfile = ZipFile(BytesIO(http_response.read()))
    zipfile.extractall(path=extract_to)

download_and_unzip(url, extract_to=path)    
