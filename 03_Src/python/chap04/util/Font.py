from util.VT100 import cursorMove, clearScreen, reset, setForeground, setBackground

space = [ # space
    [' ',' ',' ',' ',' ',],
    [' ',' ',' ',' ',' ',],
    [' ',' ',' ',' ',' ',],
    [' ',' ',' ',' ',' ',],
    [' ',' ',' ',' ',' ',],
]

undefined = [ # undefined
    ['=','=','=','=','=',],
    ['=','=','=','=','=',],
    ['=','=','=','=','=',],
    ['=','=','=','=','=',],
    ['=','=','=','=','=',],
]



number = [ 
    [ # 0
        ['=','=','=','=','=',],
        ['=',' ',' ',' ','=',],
        ['=',' ',' ',' ','=',],
        ['=',' ',' ',' ','=',],
        ['=','=','=','=','=',],
    ],
    [ # 1
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
    ],
    [ # 2
        ['=','=','=','=','=',],
        [' ',' ',' ',' ','=',],
        ['=','=','=','=','=',],
        ['=',' ',' ',' ',' ',],
        ['=','=','=','=','=',],
    ],
    [ # 3
        ['=','=','=','=','=',],
        [' ',' ',' ',' ','=',],
        ['=','=','=','=','=',],
        [' ',' ',' ',' ','=',],
        ['=','=','=','=','=',],
    ], 
    [ # 4
        ['=',' ',' ',' ','=',],
        ['=',' ',' ',' ','=',],
        ['=','=','=','=','=',],
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
    ], 
    [ # 5
        ['=','=','=','=','=',],
        ['=',' ',' ',' ',' ',],
        ['=','=','=','=','=',],
        [' ',' ',' ',' ','=',],
        ['=','=','=','=','=',],
    ], 
    [ # 6
        ['=','=','=','=','=',],
        ['=',' ',' ',' ',' ',],
        ['=','=','=','=','=',],
        ['=',' ',' ',' ','=',],
        ['=','=','=','=','=',],
    ], 
    [ # 7
        ['=','=','=','=','=',],
        ['=',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
        [' ',' ',' ',' ','=',],
    ], 
    [ # 8
        ['=','=','=','=','=',],
        ['=',' ',' ',' ','=',],
        ['=','=','=','=','=',],
        ['=',' ',' ',' ','=',],
        ['=','=','=','=','=',],
    ], 
    [ # 9
        ['=','=','=','=','=',],
        ['=',' ',' ',' ','=',],
        ['=','=','=','=','=',],
        [' ',' ',' ',' ','=',],
        ['=','=','=','=','=',],
    ],                                
]

def printFont(ch, line, column):
    fg = 31
    bg = 44
    
    font = []
    if ch == ' ':
        font = space
    elif '0'<=ch<='9':
        font = number[int(ch)]
    else:
        font = undefined    
    
    for i in range(5):
        for j in range(5):
            cursorMove(line+i, column+j)
            if font[i][j] == ' ':
                reset()
            else:
                setForeground(fg)
                setBackground(bg)
                
            print(font[i][j], end='', flush=True)
            
            # tmp = fg
            # fg = bg
            # bg = tmp
            fg, bg = bg, fg # tuple 대입
            
            fg = 30 + fg%10
            bg = 40 + bg%10
    reset()
    
