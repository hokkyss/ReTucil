import http.server
import socketserver

PORT = 8000
Handler = http.server.SimpleHTTPRequestHandler

with socketserver.TCPServer(("", PORT), Handler) as http:
    print("serving at port", PORT)
    http.serve_forever()

# command : python server.py
# http://localhost:8000