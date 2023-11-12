/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to WinUser.h and user32.dll. */
public class User32 {

	/** Window Styles */
	public static final int
		WS_OVERLAPPED       = 0x0,
		WS_POPUP            = 0x80000000,
		WS_CHILD            = 0x40000000,
		WS_MINIMIZE         = 0x20000000,
		WS_VISIBLE          = 0x10000000,
		WS_DISABLED         = 0x8000000,
		WS_CLIPSIBLINGS     = 0x4000000,
		WS_CLIPCHILDREN     = 0x2000000,
		WS_MAXIMIZE         = 0x1000000,
		WS_CAPTION          = 0xC00000,
		WS_BORDER           = 0x800000,
		WS_DLGFRAME         = 0x400000,
		WS_VSCROLL          = 0x200000,
		WS_HSCROLL          = 0x100000,
		WS_SYSMENU          = 0x80000,
		WS_THICKFRAME       = 0x40000,
		WS_GROUP            = 0x20000,
		WS_TABSTOP          = 0x10000,
		WS_MINIMIZEBOX      = 0x20000,
		WS_MAXIMIZEBOX      = 0x10000,
		WS_OVERLAPPEDWINDOW = WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX,
		WS_POPUPWINDOW      = WS_POPUP | WS_BORDER | WS_SYSMENU,
		WS_CHILDWINDOW      = WS_CHILD,
		WS_TILED            = WS_OVERLAPPED,
		WS_ICONIC           = WS_MINIMIZE,
		WS_SIZEBOX          = WS_THICKFRAME,
		WS_TILEDWINDOW      = WS_OVERLAPPEDWINDOW;

	/** Extended Window Styles */
	public static final int
		WS_EX_DLGMODALFRAME    = 0x1,
		WS_EX_NOPARENTNOTIFY   = 0x4,
		WS_EX_TOPMOST          = 0x8,
		WS_EX_ACCEPTFILES      = 0x10,
		WS_EX_TRANSPARENT      = 0x20,
		WS_EX_MDICHILD         = 0x40,
		WS_EX_TOOLWINDOW       = 0x80,
		WS_EX_WINDOWEDGE       = 0x100,
		WS_EX_CLIENTEDGE       = 0x200,
		WS_EX_CONTEXTHELP      = 0x400,
		WS_EX_RIGHT            = 0x1000,
		WS_EX_LEFT             = 0x0,
		WS_EX_RTLREADING       = 0x2000,
		WS_EX_LTRREADING       = 0x0,
		WS_EX_LEFTSCROLLBAR    = 0x4000,
		WS_EX_RIGHTSCROLLBAR   = 0x0,
		WS_EX_CONTROLPARENT    = 0x10000,
		WS_EX_STATICEDGE       = 0x20000,
		WS_EX_APPWINDOW        = 0x40000,
		WS_EX_OVERLAPPEDWINDOW = WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE,
		WS_EX_PALETTEWINDOW    = WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST,
		WS_EX_LAYERED          = 0x80000,
		WS_EX_NOINHERITLAYOUT  = 0x100000,
		WS_EX_LAYOUTRTL        = 0x400000,
		WS_EX_COMPOSITED       = 0x2000000,
		WS_EX_NOACTIVATE       = 0x8000000;

	/** May be used in {@link #CreateWindowEx} for the x, y, width, height parameters. */
	public static final int CW_USEDEFAULT = 0x80000000;

	/** Class styles */
	public static final int
		CS_VREDRAW         = 0x1,
		CS_HREDRAW         = 0x2,
		CS_DBLCLKS         = 0x8,
		CS_OWNDC           = 0x20,
		CS_CLASSDC         = 0x40,
		CS_PARENTDC        = 0x80,
		CS_NOCLOSE         = 0x200,
		CS_SAVEBITS        = 0x800,
		CS_BYTEALIGNCLIENT = 0x1000,
		CS_BYTEALIGNWINDOW = 0x2000,
		CS_GLOBALCLASS     = 0x4000,
		CS_IME             = 0x10000,
		CS_DROPSHADOW      = 0x20000;

	/** Windows messages. */
	public static final int
		WM_NULL                           = 0x0,
		WM_CREATE                         = 0x1,
		WM_DESTROY                        = 0x2,
		WM_MOVE                           = 0x3,
		WM_SIZE                           = 0x5,
		WM_ACTIVATE                       = 0x6,
		WM_SETFOCUS                       = 0x7,
		WM_KILLFOCUS                      = 0x8,
		WM_ENABLE                         = 0xA,
		WM_SETREDRAW                      = 0xB,
		WM_SETTEXT                        = 0xC,
		WM_GETTEXT                        = 0xD,
		WM_GETTEXTLENGTH                  = 0xE,
		WM_PAINT                          = 0xF,
		WM_CLOSE                          = 0x10,
		WM_QUERYENDSESSION                = 0x11,
		WM_QUERYOPEN                      = 0x13,
		WM_ENDSESSION                     = 0x16,
		WM_QUIT                           = 0x12,
		WM_ERASEBKGND                     = 0x14,
		WM_SYSCOLORCHANGE                 = 0x15,
		WM_SHOWWINDOW                     = 0x18,
		WM_WININICHANGE                   = 0x1A,
		WM_SETTINGCHANGE                  = WM_WININICHANGE,
		WM_DEVMODECHANGE                  = 0x1B,
		WM_ACTIVATEAPP                    = 0x1C,
		WM_FONTCHANGE                     = 0x1D,
		WM_TIMECHANGE                     = 0x1E,
		WM_CANCELMODE                     = 0x1F,
		WM_SETCURSOR                      = 0x20,
		WM_MOUSEACTIVATE                  = 0x21,
		WM_CHILDACTIVATE                  = 0x22,
		WM_QUEUESYNC                      = 0x23,
		WM_GETMINMAXINFO                  = 0x24,
		WM_PAINTICON                      = 0x26,
		WM_ICONERASEBKGND                 = 0x27,
		WM_NEXTDLGCTL                     = 0x28,
		WM_SPOOLERSTATUS                  = 0x2A,
		WM_DRAWITEM                       = 0x2B,
		WM_MEASUREITEM                    = 0x2C,
		WM_DELETEITEM                     = 0x2D,
		WM_VKEYTOITEM                     = 0x2E,
		WM_CHARTOITEM                     = 0x2F,
		WM_SETFONT                        = 0x30,
		WM_GETFONT                        = 0x31,
		WM_SETHOTKEY                      = 0x32,
		WM_GETHOTKEY                      = 0x33,
		WM_QUERYDRAGICON                  = 0x37,
		WM_COMPAREITEM                    = 0x39,
		WM_GETOBJECT                      = 0x3D,
		WM_COMPACTING                     = 0x41,
		WM_COMMNOTIFY                     = 0x44,
		WM_WINDOWPOSCHANGING              = 0x46,
		WM_WINDOWPOSCHANGED               = 0x47,
		WM_POWER                          = 0x48,
		WM_COPYDATA                       = 0x4A,
		WM_CANCELJOURNAL                  = 0x4B,
		WM_NOTIFY                         = 0x4E,
		WM_INPUTLANGCHANGEREQUEST         = 0x50,
		WM_INPUTLANGCHANGE                = 0x51,
		WM_TCARD                          = 0x52,
		WM_HELP                           = 0x53,
		WM_USERCHANGED                    = 0x54,
		WM_NOTIFYFORMAT                   = 0x55,
		WM_CONTEXTMENU                    = 0x7B,
		WM_STYLECHANGING                  = 0x7C,
		WM_STYLECHANGED                   = 0x7D,
		WM_DISPLAYCHANGE                  = 0x7E,
		WM_GETICON                        = 0x7F,
		WM_SETICON                        = 0x80,
		WM_NCCREATE                       = 0x81,
		WM_NCDESTROY                      = 0x82,
		WM_NCCALCSIZE                     = 0x83,
		WM_NCHITTEST                      = 0x84,
		WM_NCPAINT                        = 0x85,
		WM_NCACTIVATE                     = 0x86,
		WM_GETDLGCODE                     = 0x87,
		WM_SYNCPAINT                      = 0x88,
		WM_NCMOUSEMOVE                    = 0xA0,
		WM_NCLBUTTONDOWN                  = 0xA1,
		WM_NCLBUTTONUP                    = 0xA2,
		WM_NCLBUTTONDBLCLK                = 0xA3,
		WM_NCRBUTTONDOWN                  = 0xA4,
		WM_NCRBUTTONUP                    = 0xA5,
		WM_NCRBUTTONDBLCLK                = 0xA6,
		WM_NCMBUTTONDOWN                  = 0xA7,
		WM_NCMBUTTONUP                    = 0xA8,
		WM_NCMBUTTONDBLCLK                = 0xA9,
		WM_NCXBUTTONDOWN                  = 0xAB,
		WM_NCXBUTTONUP                    = 0xAC,
		WM_NCXBUTTONDBLCLK                = 0xAD,
		WM_INPUT_DEVICE_CHANGE            = 0xFE,
		WM_INPUT                          = 0xFF,
		WM_KEYFIRST                       = 0x100,
		WM_KEYDOWN                        = 0x100,
		WM_KEYUP                          = 0x101,
		WM_CHAR                           = 0x102,
		WM_DEADCHAR                       = 0x103,
		WM_SYSKEYDOWN                     = 0x104,
		WM_SYSKEYUP                       = 0x105,
		WM_SYSCHAR                        = 0x106,
		WM_SYSDEADCHAR                    = 0x107,
		WM_UNICHAR                        = 0x109,
		UNICODE_NOCHAR                    = 0xFFFF,
		WM_IME_STARTCOMPOSITION           = 0x10D,
		WM_IME_ENDCOMPOSITION             = 0x10E,
		WM_IME_COMPOSITION                = 0x10F,
		WM_IME_KEYLAST                    = 0x10F,
		WM_INITDIALOG                     = 0x110,
		WM_COMMAND                        = 0x111,
		WM_SYSCOMMAND                     = 0x112,
		WM_TIMER                          = 0x113,
		WM_HSCROLL                        = 0x114,
		WM_VSCROLL                        = 0x115,
		WM_INITMENU                       = 0x116,
		WM_INITMENUPOPUP                  = 0x117,
		WM_GESTURE                        = 0x119,
		WM_GESTURENOTIFY                  = 0x11A,
		WM_MENUSELECT                     = 0x11F,
		WM_MENUCHAR                       = 0x120,
		WM_ENTERIDLE                      = 0x121,
		WM_MENURBUTTONUP                  = 0x122,
		WM_MENUDRAG                       = 0x123,
		WM_MENUGETOBJECT                  = 0x124,
		WM_UNINITMENUPOPUP                = 0x125,
		WM_MENUCOMMAND                    = 0x126,
		WM_CHANGEUISTATE                  = 0x127,
		WM_UPDATEUISTATE                  = 0x128,
		WM_QUERYUISTATE                   = 0x129,
		WM_CTLCOLORMSGBOX                 = 0x132,
		WM_CTLCOLOREDIT                   = 0x133,
		WM_CTLCOLORLISTBOX                = 0x134,
		WM_CTLCOLORBTN                    = 0x135,
		WM_CTLCOLORDLG                    = 0x136,
		WM_CTLCOLORSCROLLBAR              = 0x137,
		WM_CTLCOLORSTATIC                 = 0x138,
		MN_GETHMENU                       = 0x1E1,
		WM_MOUSEFIRST                     = 0x200,
		WM_MOUSEMOVE                      = 0x200,
		WM_LBUTTONDOWN                    = 0x201,
		WM_LBUTTONUP                      = 0x202,
		WM_LBUTTONDBLCLK                  = 0x203,
		WM_RBUTTONDOWN                    = 0x204,
		WM_RBUTTONUP                      = 0x205,
		WM_RBUTTONDBLCLK                  = 0x206,
		WM_MBUTTONDOWN                    = 0x207,
		WM_MBUTTONUP                      = 0x208,
		WM_MBUTTONDBLCLK                  = 0x209,
		WM_MOUSEWHEEL                     = 0x20A,
		WM_XBUTTONDOWN                    = 0x20B,
		WM_XBUTTONUP                      = 0x20C,
		WM_XBUTTONDBLCLK                  = 0x20D,
		WM_MOUSEHWHEEL                    = 0x20E,
		WM_PARENTNOTIFY                   = 0x210,
		WM_ENTERMENULOOP                  = 0x211,
		WM_EXITMENULOOP                   = 0x212,
		WM_NEXTMENU                       = 0x213,
		WM_SIZING                         = 0x214,
		WM_CAPTURECHANGED                 = 0x215,
		WM_MOVING                         = 0x216,
		WM_POWERBROADCAST                 = 0x218,
		WM_DEVICECHANGE                   = 0x219,
		WM_MDICREATE                      = 0x220,
		WM_MDIDESTROY                     = 0x221,
		WM_MDIACTIVATE                    = 0x222,
		WM_MDIRESTORE                     = 0x223,
		WM_MDINEXT                        = 0x224,
		WM_MDIMAXIMIZE                    = 0x225,
		WM_MDITILE                        = 0x226,
		WM_MDICASCADE                     = 0x227,
		WM_MDIICONARRANGE                 = 0x228,
		WM_MDIGETACTIVE                   = 0x229,
		WM_MDISETMENU                     = 0x230,
		WM_ENTERSIZEMOVE                  = 0x231,
		WM_EXITSIZEMOVE                   = 0x232,
		WM_DROPFILES                      = 0x233,
		WM_MDIREFRESHMENU                 = 0x234,
		WM_TOUCH                          = 0x240,
		WM_IME_SETCONTEXT                 = 0x281,
		WM_IME_NOTIFY                     = 0x282,
		WM_IME_CONTROL                    = 0x283,
		WM_IME_COMPOSITIONFULL            = 0x284,
		WM_IME_SELECT                     = 0x285,
		WM_IME_CHAR                       = 0x286,
		WM_IME_REQUEST                    = 0x288,
		WM_IME_KEYDOWN                    = 0x290,
		WM_IME_KEYUP                      = 0x291,
		WM_MOUSEHOVER                     = 0x2A1,
		WM_MOUSELEAVE                     = 0x2A3,
		WM_NCMOUSEHOVER                   = 0x2A0,
		WM_NCMOUSELEAVE                   = 0x2A2,
		WM_WTSSESSION_CHANGE              = 0x2B1,
		WM_TABLET_FIRST                   = 0x2C0,
		WM_TABLET_LAST                    = 0x2DF,
		WM_CUT                            = 0x300,
		WM_COPY                           = 0x301,
		WM_PASTE                          = 0x302,
		WM_CLEAR                          = 0x303,
		WM_UNDO                           = 0x304,
		WM_RENDERFORMAT                   = 0x305,
		WM_RENDERALLFORMATS               = 0x306,
		WM_DESTROYCLIPBOARD               = 0x307,
		WM_DRAWCLIPBOARD                  = 0x308,
		WM_PAINTCLIPBOARD                 = 0x309,
		WM_VSCROLLCLIPBOARD               = 0x30A,
		WM_SIZECLIPBOARD                  = 0x30B,
		WM_ASKCBFORMATNAME                = 0x30C,
		WM_CHANGECBCHAIN                  = 0x30D,
		WM_HSCROLLCLIPBOARD               = 0x30E,
		WM_QUERYNEWPALETTE                = 0x30F,
		WM_PALETTEISCHANGING              = 0x310,
		WM_PALETTECHANGED                 = 0x311,
		WM_HOTKEY                         = 0x312,
		WM_PRINT                          = 0x317,
		WM_PRINTCLIENT                    = 0x318,
		WM_APPCOMMAND                     = 0x319,
		WM_THEMECHANGED                   = 0x31A,
		WM_CLIPBOARDUPDATE                = 0x31D,
		WM_DWMCOMPOSITIONCHANGED          = 0x31E,
		WM_DWMNCRENDERINGCHANGED          = 0x31F,
		WM_DWMCOLORIZATIONCOLORCHANGED    = 0x320,
		WM_DWMWINDOWMAXIMIZEDCHANGE       = 0x321,
		WM_DWMSENDICONICTHUMBNAIL         = 0x323,
		WM_DWMSENDICONICLIVEPREVIEWBITMAP = 0x326,
		WM_GETTITLEBARINFOEX              = 0x33F,
		WM_HANDHELDFIRST                  = 0x358,
		WM_HANDHELDLAST                   = 0x35F,
		WM_AFXFIRST                       = 0x360,
		WM_AFXLAST                        = 0x37F,
		WM_PENWINFIRST                    = 0x380,
		WM_PENWINLAST                     = 0x38F,
		WM_APP                            = 0x8000,
		WM_USER                           = 0x400;

	/** {@link #WM_ACTIVATE} message {@code wParam} values. */
	public static final int
		WA_ACTIVE      = 1,
		WA_CLICKACTIVE = 2,
		WA_INACTIVE    = 0;

	/** {@link #WM_SIZE} message {@code wParam} values. */
	public static final int
		SIZE_RESTORED  = 0,
		SIZE_MINIMIZED = 1,
		SIZE_MAXIMIZED = 2,
		SIZE_MAXSHOW   = 3,
		SIZE_MAXHIDE   = 4;

	/** {@link #WM_DEVICECHANGE} message {@code wParam} params. */
	public static final int
		DBT_APPYBEGIN            = 0x0,
		DBT_APPYEND              = 0x1,
		DBT_DEVNODES_CHANGED     = 0x7,
		DBT_QUERYCHANGECONFIG    = 0x17,
		DBT_CONFIGCHANGED        = 0x18,
		DBT_CONFIGCHANGECANCELED = 0x19,
		DBT_MONITORCHANGE        = 0x1B;

	/** System menu command values. */
	public static final int
		SC_SIZE         = 0xF000,
		SC_MOVE         = 0xF010,
		SC_MINIMIZE     = 0xF020,
		SC_MAXIMIZE     = 0xF030,
		SC_NEXTWINDOW   = 0xF040,
		SC_PREVWINDOW   = 0xF050,
		SC_CLOSE        = 0xF060,
		SC_VSCROLL      = 0xF070,
		SC_HSCROLL      = 0xF080,
		SC_MOUSEMENU    = 0xF090,
		SC_KEYMENU      = 0xF100,
		SC_ARRANGE      = 0xF110,
		SC_RESTORE      = 0xF120,
		SC_TASKLIST     = 0xF130,
		SC_SCREENSAVE   = 0xF140,
		SC_HOTKEY       = 0xF150,
		SC_DEFAULT      = 0xF160,
		SC_MONITORPOWER = 0xF170,
		SC_CONTEXTHELP  = 0xF180,
		SC_SEPARATOR    = 0xF00F;

	/** Key state masks for mouse messages. */
	public static final int
		MK_LBUTTON  = 0x1,
		MK_RBUTTON  = 0x2,
		MK_SHIFT    = 0x4,
		MK_CONTROL  = 0x8,
		MK_MBUTTON  = 0x10,
		MK_XBUTTON1 = 0x20,
		MK_XBUTTON2 = 0x40;

	/** Mouse position codes. */
	public static final int
		HTERROR       = -2,
		HTTRANSPARENT = -1,
		HTNOWHERE     = 0,
		HTCLIENT      = 1,
		HTCAPTION     = 2,
		HTSYSMENU     = 3,
		HTGROWBOX     = 4,
		HTSIZE        = HTGROWBOX,
		HTMENU        = 5,
		HTHSCROLL     = 6,
		HTVSCROLL     = 7,
		HTMINBUTTON   = 8,
		HTMAXBUTTON   = 9,
		HTLEFT        = 10,
		HTRIGHT       = 11,
		HTTOP         = 12,
		HTTOPLEFT     = 13,
		HTTOPRIGHT    = 14,
		HTBOTTOM      = 15,
		HTBOTTOMLEFT  = 16,
		HTBOTTOMRIGHT = 17,
		HTBORDER      = 18,
		HTREDUCE      = HTMINBUTTON,
		HTZOOM        = HTMAXBUTTON,
		HTSIZEFIRST   = HTLEFT,
		HTSIZELAST    = HTBOTTOMRIGHT,
		HTOBJECT      = 19,
		HTCLOSE       = 20,
		HTHELP        = 21;

	/** Window field offsets for {@link #GetWindowLongPtr}. */
	public static final int
		GWL_WNDPROC    = -4,
		GWL_HINSTANCE  = -6,
		GWL_HWNDPARENT = -8,
		GWL_STYLE      = -16,
		GWL_EXSTYLE    = -20,
		GWL_USERDATA   = -21,
		GWL_ID         = -12;

	/** {@link #ShowWindow} commands. */
	public static final int
		SW_HIDE            = 0,
		SW_SHOWNORMAL      = 1,
		SW_NORMAL          = 1,
		SW_SHOWMINIMIZED   = 2,
		SW_SHOWMAXIMIZED   = 3,
		SW_MAXIMIZE        = 3,
		SW_SHOWNOACTIVATE  = 4,
		SW_SHOW            = 5,
		SW_MINIMIZE        = 6,
		SW_SHOWMINNOACTIVE = 7,
		SW_SHOWNA          = 8,
		SW_RESTORE         = 9,
		SW_SHOWDEFAULT     = 10,
		SW_FORCEMINIMIZE   = 11,
		SW_MAX             = 11;

	/** Virtual window handles used by the {@link #SetWindowPos} insertAfter argument. */
	public static final long
		HWND_TOP       = 0x0L,
		HWND_BOTTOM    = 0x1L,
		HWND_TOPMOST   = 0xFFFFFFFFFFFFFFFFL,
		HWND_NOTOPMOST = 0xFFFFFFFFFFFFFFFEL;

	/**
	 * Virtual window handle used by {@link #PostMessage} that matches all top-level windows in the system, including disabled or invisible unowned windows,
	 * overlapped windows, and pop-up windows.
	 */
	public static final long HWND_BROADCAST = 0xFFFFL;

	/** Window sizing and positiong flags used by the {@link #SetWindowPos} flags argument. */
	public static final int
		SWP_NOSIZE         = 0x1,
		SWP_NOMOVE         = 0x2,
		SWP_NOZORDER       = 0x4,
		SWP_NOREDRAW       = 0x8,
		SWP_NOACTIVATE     = 0x10,
		SWP_FRAMECHANGED   = 0x20,
		SWP_SHOWWINDOW     = 0x40,
		SWP_HIDEWINDOW     = 0x80,
		SWP_NOCOPYBITS     = 0x100,
		SWP_NOOWNERZORDER  = 0x200,
		SWP_NOSENDCHANGING = 0x400,
		SWP_DRAWFRAME      = SWP_FRAMECHANGED,
		SWP_NOREPOSITION   = SWP_NOOWNERZORDER,
		SWP_DEFERERASE     = 0x2000,
		SWP_ASYNCWINDOWPOS = 0x4000;

	/** Standard Icon IDs. Use with {@link #LoadIcon}. */
	public static final int
		IDI_APPLICATION = 32512,
		IDI_HAND        = 32513,
		IDI_QUESTION    = 32514,
		IDI_EXCLAMATION = 32515,
		IDI_ASTERISK    = 32516,
		IDI_WINLOGO     = 32517,
		IDI_SHIELD      = 32518,
		IDI_WARNING     = IDI_EXCLAMATION,
		IDI_ERROR       = IDI_HAND,
		IDI_INFORMATION = IDI_ASTERISK;

	/** Standard Cursor IDs. Use with {@link #LoadCursor}. */
	public static final int
		IDC_ARROW       = 32512,
		IDC_IBEAM       = 32513,
		IDC_WAIT        = 32514,
		IDC_CROSS       = 32515,
		IDC_UPARROW     = 32516,
		IDC_SIZE        = 32640,
		IDC_ICON        = 32641,
		IDC_SIZENWSE    = 32642,
		IDC_SIZENESW    = 32643,
		IDC_SIZEWE      = 32644,
		IDC_SIZENS      = 32645,
		IDC_SIZEALL     = 32646,
		IDC_NO          = 32648,
		IDC_HAND        = 32649,
		IDC_APPSTARTING = 32650,
		IDC_HELP        = 32651;

	/** Class field offsets for {@link #GetClassLongPtr}. */
	public static final int
		GCL_MENUNAME      = -8,
		GCL_HBRBACKGROUND = -10,
		GCL_HCURSOR       = -12,
		GCL_HICON         = -14,
		GCL_HMODULE       = -16,
		GCL_CBWNDEXTRA    = -18,
		GCL_CBCLSEXTRA    = -20,
		GCL_WNDPROC       = -24,
		GCL_STYLE         = -26,
		GCW_ATOM          = -32,
		GCL_HICONSM       = -34;

	/** Queue status flags for {@link #GetQueueStatus} and {@link #MsgWaitForMultipleObjects} */
	public static final int
		QS_KEY            = 0x1,
		QS_MOUSEMOVE      = 0x2,
		QS_MOUSEBUTTON    = 0x4,
		QS_POSTMESSAGE    = 0x8,
		QS_TIMER          = 0x10,
		QS_PAINT          = 0x20,
		QS_SENDMESSAGE    = 0x40,
		QS_HOTKEY         = 0x80,
		QS_ALLPOSTMESSAGE = 0x100,
		QS_RAWINPUT       = 0x400,
		QS_MOUSE          = QS_MOUSEMOVE | QS_MOUSEBUTTON,
		QS_INPUT          = QS_MOUSE | QS_KEY,
		QS_ALLEVENTS      = QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY,
		QS_ALLINPUT       = QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY | QS_SENDMESSAGE;

	/** Remove message flags for {@link #PeekMessage}. */
	public static final int
		PM_NOREMOVE       = 0x0,
		PM_REMOVE         = 0x1,
		PM_NOYIELD        = 0x2,
		PM_QS_INPUT       = QS_INPUT << 16,
		PM_QS_POSTMESSAGE = (QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16,
		PM_QS_PAINT       = QS_PAINT << 16,
		PM_QS_SENDMESSAGE = QS_SENDMESSAGE << 16;

	/** Virtual Keys. */
	public static final int
		VK_LBUTTON             = 0x1,
		VK_RBUTTON             = 0x2,
		VK_CANCEL              = 0x3,
		VK_MBUTTON             = 0x4,
		VK_XBUTTON1            = 0x5,
		VK_XBUTTON2            = 0x6,
		VK_BACK                = 0x8,
		VK_TAB                 = 0x9,
		VK_CLEAR               = 0xC,
		VK_RETURN              = 0xD,
		VK_SHIFT               = 0x10,
		VK_CONTROL             = 0x11,
		VK_MENU                = 0x12,
		VK_PAUSE               = 0x13,
		VK_CAPITAL             = 0x14,
		VK_KANA                = 0x15,
		VK_HANGEUL             = 0x15,
		VK_HANGUL              = 0x15,
		VK_JUNJA               = 0x17,
		VK_FINAL               = 0x18,
		VK_HANJA               = 0x19,
		VK_KANJI               = 0x19,
		VK_ESCAPE              = 0x1B,
		VK_CONVERT             = 0x1C,
		VK_NONCONVERT          = 0x1D,
		VK_ACCEPT              = 0x1E,
		VK_MODECHANGE          = 0x1F,
		VK_SPACE               = 0x20,
		VK_PRIOR               = 0x21,
		VK_NEXT                = 0x22,
		VK_END                 = 0x23,
		VK_HOME                = 0x24,
		VK_LEFT                = 0x25,
		VK_UP                  = 0x26,
		VK_RIGHT               = 0x27,
		VK_DOWN                = 0x28,
		VK_SELECT              = 0x29,
		VK_PRINT               = 0x2A,
		VK_EXECUTE             = 0x2B,
		VK_SNAPSHOT            = 0x2C,
		VK_INSERT              = 0x2D,
		VK_DELETE              = 0x2E,
		VK_HELP                = 0x2F,
		VK_LWIN                = 0x5B,
		VK_RWIN                = 0x5C,
		VK_APPS                = 0x5D,
		VK_SLEEP               = 0x5F,
		VK_NUMPAD0             = 0x60,
		VK_NUMPAD1             = 0x61,
		VK_NUMPAD2             = 0x62,
		VK_NUMPAD3             = 0x63,
		VK_NUMPAD4             = 0x64,
		VK_NUMPAD5             = 0x65,
		VK_NUMPAD6             = 0x66,
		VK_NUMPAD7             = 0x67,
		VK_NUMPAD8             = 0x68,
		VK_NUMPAD9             = 0x69,
		VK_MULTIPLY            = 0x6A,
		VK_ADD                 = 0x6B,
		VK_SEPARATOR           = 0x6C,
		VK_SUBTRACT            = 0x6D,
		VK_DECIMAL             = 0x6E,
		VK_DIVIDE              = 0x6F,
		VK_F1                  = 0x70,
		VK_F2                  = 0x71,
		VK_F3                  = 0x72,
		VK_F4                  = 0x73,
		VK_F5                  = 0x74,
		VK_F6                  = 0x75,
		VK_F7                  = 0x76,
		VK_F8                  = 0x77,
		VK_F9                  = 0x78,
		VK_F10                 = 0x79,
		VK_F11                 = 0x7A,
		VK_F12                 = 0x7B,
		VK_F13                 = 0x7C,
		VK_F14                 = 0x7D,
		VK_F15                 = 0x7E,
		VK_F16                 = 0x7F,
		VK_F17                 = 0x80,
		VK_F18                 = 0x81,
		VK_F19                 = 0x82,
		VK_F20                 = 0x83,
		VK_F21                 = 0x84,
		VK_F22                 = 0x85,
		VK_F23                 = 0x86,
		VK_F24                 = 0x87,
		VK_NUMLOCK             = 0x90,
		VK_SCROLL              = 0x91,
		VK_OEM_NEC_EQUAL       = 0x92,
		VK_OEM_FJ_JISHO        = 0x92,
		VK_OEM_FJ_MASSHOU      = 0x93,
		VK_OEM_FJ_TOUROKU      = 0x94,
		VK_OEM_FJ_LOYA         = 0x95,
		VK_OEM_FJ_ROYA         = 0x96,
		VK_LSHIFT              = 0xA0,
		VK_RSHIFT              = 0xA1,
		VK_LCONTROL            = 0xA2,
		VK_RCONTROL            = 0xA3,
		VK_LMENU               = 0xA4,
		VK_RMENU               = 0xA5,
		VK_BROWSER_BACK        = 0xA6,
		VK_BROWSER_FORWARD     = 0xA7,
		VK_BROWSER_REFRESH     = 0xA8,
		VK_BROWSER_STOP        = 0xA9,
		VK_BROWSER_SEARCH      = 0xAA,
		VK_BROWSER_FAVORITES   = 0xAB,
		VK_BROWSER_HOME        = 0xAC,
		VK_VOLUME_MUTE         = 0xAD,
		VK_VOLUME_DOWN         = 0xAE,
		VK_VOLUME_UP           = 0xAF,
		VK_MEDIA_NEXT_TRACK    = 0xB0,
		VK_MEDIA_PREV_TRACK    = 0xB1,
		VK_MEDIA_STOP          = 0xB2,
		VK_MEDIA_PLAY_PAUSE    = 0xB3,
		VK_LAUNCH_MAIL         = 0xB4,
		VK_LAUNCH_MEDIA_SELECT = 0xB5,
		VK_LAUNCH_APP1         = 0xB6,
		VK_LAUNCH_APP2         = 0xB7,
		VK_OEM_1               = 0xBA,
		VK_OEM_PLUS            = 0xBB,
		VK_OEM_COMMA           = 0xBC,
		VK_OEM_MINUS           = 0xBD,
		VK_OEM_PERIOD          = 0xBE,
		VK_OEM_2               = 0xBF,
		VK_OEM_3               = 0xC0,
		VK_OEM_4               = 0xDB,
		VK_OEM_5               = 0xDC,
		VK_OEM_6               = 0xDD,
		VK_OEM_7               = 0xDE,
		VK_OEM_8               = 0xDF,
		VK_OEM_AX              = 0xE1,
		VK_OEM_102             = 0xE2,
		VK_ICO_HELP            = 0xE3,
		VK_ICO_00              = 0xE4,
		VK_PROCESSKEY          = 0xE5,
		VK_ICO_CLEAR           = 0xE6,
		VK_PACKET              = 0xE7,
		VK_OEM_RESET           = 0xE9,
		VK_OEM_JUMP            = 0xEA,
		VK_OEM_PA1             = 0xEB,
		VK_OEM_PA2             = 0xEC,
		VK_OEM_PA3             = 0xED,
		VK_OEM_WSCTRL          = 0xEE,
		VK_OEM_CUSEL           = 0xEF,
		VK_OEM_ATTN            = 0xF0,
		VK_OEM_FINISH          = 0xF1,
		VK_OEM_COPY            = 0xF2,
		VK_OEM_AUTO            = 0xF3,
		VK_OEM_ENLW            = 0xF4,
		VK_OEM_BACKTAB         = 0xF5,
		VK_ATTN                = 0xF6,
		VK_CRSEL               = 0xF7,
		VK_EXSEL               = 0xF8,
		VK_EREOF               = 0xF9,
		VK_PLAY                = 0xFA,
		VK_ZOOM                = 0xFB,
		VK_NONAME              = 0xFC,
		VK_PA1                 = 0xFD,
		VK_OEM_CLEAR           = 0xFE;

	/** XButton values. */
	public static final int
		XBUTTON1 = 0x1,
		XBUTTON2 = 0x2;

	/** Value for rolling one detent. */
	public static final int WHEEL_DELTA = 120;

	/** {@link WINDOWPLACEMENT} flags. */
	public static final int
		WPF_SETMINPOSITION       = 0x1,
		WPF_RESTORETOMAXIMIZED   = 0x2,
		WPF_ASYNCWINDOWPLACEMENT = 0x4;

	/** Actions for {@link #SetLayeredWindowAttributes}. */
	public static final int
		LWA_COLORKEY = 0x1,
		LWA_ALPHA    = 0x2;

	/** {@link #GetSystemMetrics} codes. */
	public static final int
		SM_CXSCREEN                    = 0,
		SM_CYSCREEN                    = 1,
		SM_CXVSCROLL                   = 2,
		SM_CYHSCROLL                   = 3,
		SM_CYCAPTION                   = 4,
		SM_CXBORDER                    = 5,
		SM_CYBORDER                    = 6,
		SM_CXDLGFRAME                  = 7,
		SM_CYDLGFRAME                  = 8,
		SM_CYVTHUMB                    = 9,
		SM_CXHTHUMB                    = 10,
		SM_CXICON                      = 11,
		SM_CYICON                      = 12,
		SM_CXCURSOR                    = 13,
		SM_CYCURSOR                    = 14,
		SM_CYMENU                      = 15,
		SM_CXFULLSCREEN                = 16,
		SM_CYFULLSCREEN                = 17,
		SM_CYKANJIWINDOW               = 18,
		SM_MOUSEPRESENT                = 19,
		SM_CYVSCROLL                   = 20,
		SM_CXHSCROLL                   = 21,
		SM_DEBUG                       = 22,
		SM_SWAPBUTTON                  = 23,
		SM_RESERVED1                   = 24,
		SM_RESERVED2                   = 25,
		SM_RESERVED3                   = 26,
		SM_RESERVED4                   = 27,
		SM_CXMIN                       = 28,
		SM_CYMIN                       = 29,
		SM_CXSIZE                      = 30,
		SM_CYSIZE                      = 31,
		SM_CXFRAME                     = 32,
		SM_CYFRAME                     = 33,
		SM_CXMINTRACK                  = 34,
		SM_CYMINTRACK                  = 35,
		SM_CXDOUBLECLK                 = 36,
		SM_CYDOUBLECLK                 = 37,
		SM_CXICONSPACING               = 38,
		SM_CYICONSPACING               = 39,
		SM_MENUDROPALIGNMENT           = 40,
		SM_PENWINDOWS                  = 41,
		SM_DBCSENABLED                 = 42,
		SM_CMOUSEBUTTONS               = 43,
		SM_CXFIXEDFRAME                = SM_CXDLGFRAME,
		SM_CYFIXEDFRAME                = SM_CYDLGFRAME,
		SM_CXSIZEFRAME                 = SM_CXFRAME,
		SM_CYSIZEFRAME                 = SM_CYFRAME,
		SM_SECURE                      = 44,
		SM_CXEDGE                      = 45,
		SM_CYEDGE                      = 46,
		SM_CXMINSPACING                = 47,
		SM_CYMINSPACING                = 48,
		SM_CXSMICON                    = 49,
		SM_CYSMICON                    = 50,
		SM_CYSMCAPTION                 = 51,
		SM_CXSMSIZE                    = 52,
		SM_CYSMSIZE                    = 53,
		SM_CXMENUSIZE                  = 54,
		SM_CYMENUSIZE                  = 55,
		SM_ARRANGE                     = 56,
		SM_CXMINIMIZED                 = 57,
		SM_CYMINIMIZED                 = 58,
		SM_CXMAXTRACK                  = 59,
		SM_CYMAXTRACK                  = 60,
		SM_CXMAXIMIZED                 = 61,
		SM_CYMAXIMIZED                 = 62,
		SM_NETWORK                     = 63,
		SM_CLEANBOOT                   = 67,
		SM_CXDRAG                      = 68,
		SM_CYDRAG                      = 69,
		SM_SHOWSOUNDS                  = 70,
		SM_CXMENUCHECK                 = 71,
		SM_CYMENUCHECK                 = 72,
		SM_SLOWMACHINE                 = 73,
		SM_MIDEASTENABLED              = 74,
		SM_MOUSEWHEELPRESENT           = 75,
		SM_XVIRTUALSCREEN              = 76,
		SM_YVIRTUALSCREEN              = 77,
		SM_CXVIRTUALSCREEN             = 78,
		SM_CYVIRTUALSCREEN             = 79,
		SM_CMONITORS                   = 80,
		SM_SAMEDISPLAYFORMAT           = 81,
		SM_IMMENABLED                  = 82,
		SM_REMOTESESSION               = 0x1000,
		SM_SHUTTINGDOWN                = 0x2000,
		SM_REMOTECONTROL               = 0x2001,
		SM_CARETBLINKINGENABLED        = 0x2002,
		SM_CXFOCUSBORDER               = 83,
		SM_CYFOCUSBORDER               = 84,
		SM_TABLETPC                    = 86,
		SM_MEDIACENTER                 = 87,
		SM_STARTER                     = 88,
		SM_SERVERR2                    = 89,
		SM_MOUSEHORIZONTALWHEELPRESENT = 91,
		SM_CXPADDEDBORDER              = 92,
		SM_DIGITIZER                   = 94,
		SM_MAXIMUMTOUCHES              = 95;

	/** {@link #RegisterTouchWindow} flags. */
	public static final int
		TWF_FINETOUCH = 0x1,
		TWF_WANTPALM  = 0x2;

	/** Touch input flag values ({@link TOUCHINPUT#dwFlags}). */
	public static final int
		TOUCHEVENTF_MOVE       = 0x1,
		TOUCHEVENTF_DOWN       = 0x2,
		TOUCHEVENTF_UP         = 0x4,
		TOUCHEVENTF_INRANGE    = 0x8,
		TOUCHEVENTF_PRIMARY    = 0x10,
		TOUCHEVENTF_NOCOALESCE = 0x20,
		TOUCHEVENTF_PEN        = 0x40,
		TOUCHEVENTF_PALM       = 0x80;

	/** Touch input mask values ({@link TOUCHINPUT#dwMask}). */
	public static final int
		TOUCHINPUTMASKF_TIMEFROMSYSTEM = 0x1,
		TOUCHINPUTMASKF_EXTRAINFO      = 0x2,
		TOUCHINPUTMASKF_CONTACTAREA    = 0x4;

	/** {@link #MonitorFromWindow} flags. */
	public static final int
		MONITOR_DEFAULTTONULL    = 0x0,
		MONITOR_DEFAULTTOPRIMARY = 0x1,
		MONITOR_DEFAULTTONEAREST = 0x2;

	/** {@link MONITORINFOEX} flags. */
	public static final int MONITORINFOF_PRIMARY = 0x1;

	/** Flag for {@link #EnumDisplayDevices}. */
	public static final int EDD_GET_DEVICE_INTERFACE_NAME = 0x1;

	/** {@link #EnumDisplaySettingsEx} mode. */
	public static final int
		ENUM_CURRENT_SETTINGS  = -1,
		ENUM_REGISTRY_SETTINGS = -2;

	/** Flags for {@link #EnumDisplaySettingsEx}. */
	public static final int
		EDS_RAWMODE     = 0x2,
		EDS_ROTATEDMODE = 0x4;

	/** Flags for {@link #ChangeDisplaySettingsEx}. */
	public static final int
		CDS_UPDATEREGISTRY       = 0x1,
		CDS_TEST                 = 0x2,
		CDS_FULLSCREEN           = 0x4,
		CDS_GLOBAL               = 0x8,
		CDS_SET_PRIMARY          = 0x10,
		CDS_VIDEOPARAMETERS      = 0x20,
		CDS_ENABLE_UNSAFE_MODES  = 0x100,
		CDS_DISABLE_UNSAFE_MODES = 0x200,
		CDS_RESET                = 0x40000000,
		CDS_RESET_EX             = 0x20000000,
		CDS_NORESET              = 0x10000000;

	/** Return values for {@link #ChangeDisplaySettingsEx}. */
	public static final int
		DISP_CHANGE_SUCCESSFUL  = 0,
		DISP_CHANGE_RESTART     = 1,
		DISP_CHANGE_FAILED      = -1,
		DISP_CHANGE_BADMODE     = -2,
		DISP_CHANGE_NOTUPDATED  = -3,
		DISP_CHANGE_BADFLAGS    = -4,
		DISP_CHANGE_BADPARAM    = -5,
		DISP_CHANGE_BADDUALVIEW = -6;

	static { Library.initialize(); }

	protected User32() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary USER32 = Library.loadNative("user32");

	/** Contains the function pointers loaded from the user32 {@link SharedLibrary}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			RegisterClassEx            = apiGetFunctionAddress(USER32, "RegisterClassExW"),
			UnregisterClass            = apiGetFunctionAddress(USER32, "UnregisterClassW"),
			CreateWindowEx             = apiGetFunctionAddress(USER32, "CreateWindowExW"),
			DestroyWindow              = apiGetFunctionAddress(USER32, "DestroyWindow"),
			DefWindowProc              = apiGetFunctionAddress(USER32, "DefWindowProcW"),
			ShowWindow                 = apiGetFunctionAddress(USER32, "ShowWindow"),
			UpdateWindow               = apiGetFunctionAddress(USER32, "UpdateWindow"),
			SetWindowPos               = apiGetFunctionAddress(USER32, "SetWindowPos"),
			SetWindowText              = apiGetFunctionAddress(USER32, "SetWindowTextW"),
			GetMessage                 = apiGetFunctionAddress(USER32, "GetMessageW"),
			PeekMessage                = apiGetFunctionAddress(USER32, "PeekMessageW"),
			TranslateMessage           = apiGetFunctionAddress(USER32, "TranslateMessage"),
			WaitMessage                = apiGetFunctionAddress(USER32, "WaitMessage"),
			DispatchMessage            = apiGetFunctionAddress(USER32, "DispatchMessageW"),
			PostMessage                = apiGetFunctionAddress(USER32, "PostMessageW"),
			SendMessage                = apiGetFunctionAddress(USER32, "SendMessageW"),
			AdjustWindowRectEx         = apiGetFunctionAddress(USER32, "AdjustWindowRectEx"),
			GetWindowRect              = apiGetFunctionAddress(USER32, "GetWindowRect"),
			MoveWindow                 = apiGetFunctionAddress(USER32, "MoveWindow"),
			GetWindowPlacement         = apiGetFunctionAddress(USER32, "GetWindowPlacement"),
			SetWindowPlacement         = apiGetFunctionAddress(USER32, "SetWindowPlacement"),
			IsWindowVisible            = apiGetFunctionAddress(USER32, "IsWindowVisible"),
			IsIconic                   = apiGetFunctionAddress(USER32, "IsIconic"),
			IsZoomed                   = apiGetFunctionAddress(USER32, "IsZoomed"),
			BringWindowToTop           = apiGetFunctionAddress(USER32, "BringWindowToTop"),
			SetWindowLongPtr           = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "SetWindowLongPtrW" : "SetWindowLongW"),
			GetWindowLongPtr           = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "GetWindowLongPtrW" : "GetWindowLongW"),
			SetClassLongPtr            = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "SetClassLongPtrW" : "SetClassLongW"),
			GetClassLongPtr            = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "GetClassLongPtrW" : "GetClassLongW"),
			SetLayeredWindowAttributes = apiGetFunctionAddress(USER32, "SetLayeredWindowAttributes"),
			LoadIcon                   = apiGetFunctionAddress(USER32, "LoadIconW"),
			LoadCursor                 = apiGetFunctionAddress(USER32, "LoadCursorW"),
			GetDC                      = apiGetFunctionAddress(USER32, "GetDC"),
			ReleaseDC                  = apiGetFunctionAddress(USER32, "ReleaseDC"),
			GetSystemMetrics           = apiGetFunctionAddress(USER32, "GetSystemMetrics"),
			RegisterTouchWindow        = apiGetFunctionAddress(USER32, "RegisterTouchWindow"),
			UnregisterTouchWindow      = apiGetFunctionAddress(USER32, "UnregisterTouchWindow"),
			IsTouchWindow              = apiGetFunctionAddress(USER32, "IsTouchWindow"),
			GetTouchInputInfo          = apiGetFunctionAddress(USER32, "GetTouchInputInfo"),
			CloseTouchInputHandle      = apiGetFunctionAddress(USER32, "CloseTouchInputHandle"),
			MonitorFromWindow          = apiGetFunctionAddress(USER32, "MonitorFromWindow"),
			GetMonitorInfo             = apiGetFunctionAddress(USER32, "GetMonitorInfoW"),
			EnumDisplayDevices         = apiGetFunctionAddress(USER32, "EnumDisplayDevicesW"),
			EnumDisplaySettingsEx      = apiGetFunctionAddress(USER32, "EnumDisplaySettingsExW"),
			ChangeDisplaySettingsEx    = apiGetFunctionAddress(USER32, "ChangeDisplaySettingsExW"),
			GetCursorPos               = apiGetFunctionAddress(USER32, "GetCursorPos"),
			SetCursorPos               = apiGetFunctionAddress(USER32, "SetCursorPos"),
			ClipCursor                 = apiGetFunctionAddress(USER32, "ClipCursor"),
			ShowCursor                 = apiGetFunctionAddress(USER32, "ShowCursor"),
			SetCursor                  = apiGetFunctionAddress(USER32, "SetCursor");

	}

	/** Returns the user32 {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return USER32;
	}

	// --- [ RegisterClassEx ] ---

	/**
	 * Registers a window class for subsequent use in calls to the {@link #CreateWindowEx} function.
	 *
	 * @param lpwcx a {@link WNDCLASSEX} structure. You must fill the structure with the appropriate class attributes before passing it to the function.
	 */
	public static native short nRegisterClassEx(long __functionAddress, long lpwcx);

	/**
	 * Registers a window class for subsequent use in calls to the {@link #CreateWindowEx} function.
	 *
	 * @param lpwcx a {@link WNDCLASSEX} structure. You must fill the structure with the appropriate class attributes before passing it to the function.
	 */
	public static short nRegisterClassEx(long lpwcx) {
		long __functionAddress = Functions.RegisterClassEx;
		if ( CHECKS )
			WNDCLASSEX.validate(lpwcx);
		return nRegisterClassEx(__functionAddress, lpwcx);
	}

	/**
	 * Registers a window class for subsequent use in calls to the {@link #CreateWindowEx} function.
	 *
	 * @param lpwcx a {@link WNDCLASSEX} structure. You must fill the structure with the appropriate class attributes before passing it to the function.
	 */
	public static short RegisterClassEx(WNDCLASSEX lpwcx) {
		return nRegisterClassEx(lpwcx.address());
	}

	// --- [ UnregisterClass ] ---

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param lpClassName a null-terminated string or a class atom. If {@code lpClassName} is a string, it specifies the window class name. This class name must have been
	 *                    registered by a previous call to the {@link #RegisterClassEx} function. System classes, such as dialog box controls, cannot be unregistered. If this
	 *                    parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClassEx} function. The atom must be in the low-order
	 *                    word of {@code lpClassName}; the high-order word must be zero.
	 * @param hInstance   a handle to the instance of the module that created the class
	 */
	public static native int nUnregisterClass(long __functionAddress, long lpClassName, long hInstance);

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param lpClassName a null-terminated string or a class atom. If {@code lpClassName} is a string, it specifies the window class name. This class name must have been
	 *                    registered by a previous call to the {@link #RegisterClassEx} function. System classes, such as dialog box controls, cannot be unregistered. If this
	 *                    parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClassEx} function. The atom must be in the low-order
	 *                    word of {@code lpClassName}; the high-order word must be zero.
	 * @param hInstance   a handle to the instance of the module that created the class
	 */
	public static int nUnregisterClass(long lpClassName, long hInstance) {
		long __functionAddress = Functions.UnregisterClass;
		return nUnregisterClass(__functionAddress, lpClassName, hInstance);
	}

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param lpClassName a null-terminated string or a class atom. If {@code lpClassName} is a string, it specifies the window class name. This class name must have been
	 *                    registered by a previous call to the {@link #RegisterClassEx} function. System classes, such as dialog box controls, cannot be unregistered. If this
	 *                    parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClassEx} function. The atom must be in the low-order
	 *                    word of {@code lpClassName}; the high-order word must be zero.
	 * @param hInstance   a handle to the instance of the module that created the class
	 */
	public static boolean UnregisterClass(ByteBuffer lpClassName, long hInstance) {
		if ( CHECKS )
			checkNT2(lpClassName);
		return nUnregisterClass(memAddress(lpClassName), hInstance) != 0;
	}

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param lpClassName a null-terminated string or a class atom. If {@code lpClassName} is a string, it specifies the window class name. This class name must have been
	 *                    registered by a previous call to the {@link #RegisterClassEx} function. System classes, such as dialog box controls, cannot be unregistered. If this
	 *                    parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClassEx} function. The atom must be in the low-order
	 *                    word of {@code lpClassName}; the high-order word must be zero.
	 * @param hInstance   a handle to the instance of the module that created the class
	 */
	public static boolean UnregisterClass(CharSequence lpClassName, long hInstance) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer lpClassNameEncoded = stack.UTF16(lpClassName);
			return nUnregisterClass(memAddress(lpClassNameEncoded), hInstance) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ CreateWindowEx ] ---

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param dwExStyle    the extended window style of the window being created
	 * @param lpClassName  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClassEx(WNDCLASSEX)} function.
	 * @param lpWindowName the window name. If the window style specifies a title bar, the window title pointed to by {@code lpWindowName} is displayed in the title bar.
	 * @param dwStyle      the style of the window being created
	 * @param x            the initial horizontal position of the window
	 * @param y            the initial vertical position of the window
	 * @param nWidth       the width, in device units, of the window
	 * @param nHeight      the height, in device units, of the window
	 * @param hWndParent   a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle.
	 * @param hMenu        a handle to a menu, or specifies a child-window identifier, depending on the window style
	 * @param hInstance    a handle to the instance of the module to be associated with the window
	 * @param lpParam      a value to be passed to the window through the {@code CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param
	 *                     of the {@link #WM_CREATE} message.
	 */
	public static native long nCreateWindowEx(long __functionAddress, int dwExStyle, long lpClassName, long lpWindowName, int dwStyle, int x, int y, int nWidth, int nHeight, long hWndParent, long hMenu, long hInstance, long lpParam);

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param dwExStyle    the extended window style of the window being created
	 * @param lpClassName  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClassEx(WNDCLASSEX)} function.
	 * @param lpWindowName the window name. If the window style specifies a title bar, the window title pointed to by {@code lpWindowName} is displayed in the title bar.
	 * @param dwStyle      the style of the window being created
	 * @param x            the initial horizontal position of the window
	 * @param y            the initial vertical position of the window
	 * @param nWidth       the width, in device units, of the window
	 * @param nHeight      the height, in device units, of the window
	 * @param hWndParent   a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle.
	 * @param hMenu        a handle to a menu, or specifies a child-window identifier, depending on the window style
	 * @param hInstance    a handle to the instance of the module to be associated with the window
	 * @param lpParam      a value to be passed to the window through the {@code CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param
	 *                     of the {@link #WM_CREATE} message.
	 */
	public static long nCreateWindowEx(int dwExStyle, long lpClassName, long lpWindowName, int dwStyle, int x, int y, int nWidth, int nHeight, long hWndParent, long hMenu, long hInstance, long lpParam) {
		long __functionAddress = Functions.CreateWindowEx;
		return nCreateWindowEx(__functionAddress, dwExStyle, lpClassName, lpWindowName, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
	}

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param dwExStyle    the extended window style of the window being created
	 * @param lpClassName  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClassEx(WNDCLASSEX)} function.
	 * @param lpWindowName the window name. If the window style specifies a title bar, the window title pointed to by {@code lpWindowName} is displayed in the title bar.
	 * @param dwStyle      the style of the window being created
	 * @param x            the initial horizontal position of the window
	 * @param y            the initial vertical position of the window
	 * @param nWidth       the width, in device units, of the window
	 * @param nHeight      the height, in device units, of the window
	 * @param hWndParent   a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle.
	 * @param hMenu        a handle to a menu, or specifies a child-window identifier, depending on the window style
	 * @param hInstance    a handle to the instance of the module to be associated with the window
	 * @param lpParam      a value to be passed to the window through the {@code CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param
	 *                     of the {@link #WM_CREATE} message.
	 */
	public static long CreateWindowEx(int dwExStyle, ByteBuffer lpClassName, ByteBuffer lpWindowName, int dwStyle, int x, int y, int nWidth, int nHeight, long hWndParent, long hMenu, long hInstance, long lpParam) {
		if ( CHECKS ) {
			if ( lpClassName != null ) checkNT2(lpClassName);
			if ( lpWindowName != null ) checkNT2(lpWindowName);
		}
		return nCreateWindowEx(dwExStyle, memAddressSafe(lpClassName), memAddressSafe(lpWindowName), dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
	}

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param dwExStyle    the extended window style of the window being created
	 * @param lpClassName  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClassEx(WNDCLASSEX)} function.
	 * @param lpWindowName the window name. If the window style specifies a title bar, the window title pointed to by {@code lpWindowName} is displayed in the title bar.
	 * @param dwStyle      the style of the window being created
	 * @param x            the initial horizontal position of the window
	 * @param y            the initial vertical position of the window
	 * @param nWidth       the width, in device units, of the window
	 * @param nHeight      the height, in device units, of the window
	 * @param hWndParent   a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle.
	 * @param hMenu        a handle to a menu, or specifies a child-window identifier, depending on the window style
	 * @param hInstance    a handle to the instance of the module to be associated with the window
	 * @param lpParam      a value to be passed to the window through the {@code CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param
	 *                     of the {@link #WM_CREATE} message.
	 */
	public static long CreateWindowEx(int dwExStyle, CharSequence lpClassName, CharSequence lpWindowName, int dwStyle, int x, int y, int nWidth, int nHeight, long hWndParent, long hMenu, long hInstance, long lpParam) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer lpClassNameEncoded = stack.UTF16(lpClassName);
			ByteBuffer lpWindowNameEncoded = stack.UTF16(lpWindowName);
			return nCreateWindowEx(dwExStyle, memAddressSafe(lpClassNameEncoded), memAddressSafe(lpWindowNameEncoded), dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ DestroyWindow ] ---

	/**
	 * Destroys the specified window. The function sends {@link #WM_DESTROY} and {@link #WM_NCDESTROY} messages to the window to deactivate it and remove the keyboard focus
	 * from it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
	 * clipboard viewer chain (if the window is at the top of the viewer chain).
	 * 
	 * <p>If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
	 * parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.</p>
	 *
	 * @param hWnd a handle to the window to be destroyed
	 */
	public static native int nDestroyWindow(long __functionAddress, long hWnd);

	/**
	 * Destroys the specified window. The function sends {@link #WM_DESTROY} and {@link #WM_NCDESTROY} messages to the window to deactivate it and remove the keyboard focus
	 * from it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
	 * clipboard viewer chain (if the window is at the top of the viewer chain).
	 * 
	 * <p>If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
	 * parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.</p>
	 *
	 * @param hWnd a handle to the window to be destroyed
	 */
	public static boolean DestroyWindow(long hWnd) {
		long __functionAddress = Functions.DestroyWindow;
		if ( CHECKS )
			checkPointer(hWnd);
		return nDestroyWindow(__functionAddress, hWnd) != 0;
	}

	// --- [ DefWindowProc ] ---

	/**
	 * Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
	 * that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
	 *
	 * @param hWnd   a handle to the window that received the message
	 * @param Msg    the message
	 * @param wParam additional message information. The content of this parameter depends on the value of the {@code Msg} parameter.
	 * @param lParam additional message information. The content of this parameter depends on the value of the {@code Msg} parameter.
	 */
	public static long DefWindowProc(long hWnd, int Msg, long wParam, long lParam) {
		long __functionAddress = Functions.DefWindowProc;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPPPP(__functionAddress, hWnd, Msg, wParam, lParam);
	}

	// --- [ ShowWindow ] ---

	/**
	 * Sets the specified window's show state.
	 *
	 * @param hWnd     a handle to the window
	 * @param nCmdShow controls how the window is to be shown. This parameter is ignored the first time an application calls {@code ShowWindow}, if the program that
	 *                 launched the application provides a {@code STARTUPINFO} structure. Otherwise, the first time {@code ShowWindow} is called, the value should be the
	 *                 value obtained by the {@code WinMain} function in its {@code nCmdShow} parameter. In subsequent calls, this parameter can be one of:<br><table><tr><td>{@link #SW_HIDE}</td><td>{@link #SW_SHOWNORMAL}</td><td>{@link #SW_NORMAL}</td><td>{@link #SW_SHOWMINIMIZED}</td><td>{@link #SW_SHOWMAXIMIZED}</td><td>{@link #SW_MAXIMIZE}</td></tr><tr><td>{@link #SW_SHOWNOACTIVATE}</td><td>{@link #SW_SHOW}</td><td>{@link #SW_MINIMIZE}</td><td>{@link #SW_SHOWMINNOACTIVE}</td><td>{@link #SW_SHOWNA}</td><td>{@link #SW_RESTORE}</td></tr><tr><td>{@link #SW_SHOWDEFAULT}</td><td>{@link #SW_FORCEMINIMIZE}</td><td>{@link #SW_MAX}</td></tr></table>
	 */
	public static boolean ShowWindow(long hWnd, int nCmdShow) {
		long __functionAddress = Functions.ShowWindow;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPI(__functionAddress, hWnd, nCmdShow) != 0;
	}

	// --- [ UpdateWindow ] ---

	/**
	 * Updates the client area of the specified window by sending a {@link #WM_PAINT} message to the window if the window's update region is not empty. The function
	 * sends a {@link #WM_PAINT} message directly to the window procedure of the specified window, bypassing the application queue. If the update region is empty, no
	 * message is sent.
	 *
	 * @param hWnd handle to the window to be updated
	 */
	public static boolean UpdateWindow(long hWnd) {
		long __functionAddress = Functions.UpdateWindow;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPI(__functionAddress, hWnd) != 0;
	}

	// --- [ SetWindowPos ] ---

	/**
	 * Changes the size, position, and Z order of a child, pop-up, or top-level window. These windows are ordered according to their appearance on the screen.
	 * The topmost window receives the highest rank and is the first window in the Z order.
	 *
	 * @param hWnd            a handle to the window
	 * @param hWndInsertAfter a handle to the window to precede the positioned window in the Z order. This parameter must be a window handle or one of:<br><table><tr><td>{@link #HWND_TOP}</td><td>{@link #HWND_BOTTOM}</td><td>{@link #HWND_TOPMOST}</td><td>{@link #HWND_NOTOPMOST}</td></tr></table>
	 * @param X               the new position of the left side of the window, in client coordinates
	 * @param Y               the new position of the top of the window, in client coordinates
	 * @param cx              the new width of the window, in pixels
	 * @param cy              the new height of the window, in pixels
	 * @param uFlags          the window sizing and positioning flags. One or more of:<br><table><tr><td>{@link #SWP_NOSIZE}</td><td>{@link #SWP_NOMOVE}</td><td>{@link #SWP_NOZORDER}</td><td>{@link #SWP_NOREDRAW}</td><td>{@link #SWP_NOACTIVATE}</td></tr><tr><td>{@link #SWP_FRAMECHANGED}</td><td>{@link #SWP_SHOWWINDOW}</td><td>{@link #SWP_HIDEWINDOW}</td><td>{@link #SWP_NOCOPYBITS}</td><td>{@link #SWP_NOOWNERZORDER}</td></tr><tr><td>{@link #SWP_NOSENDCHANGING}</td><td>{@link #SWP_DRAWFRAME}</td><td>{@link #SWP_NOREPOSITION}</td><td>{@link #SWP_DEFERERASE}</td><td>{@link #SWP_ASYNCWINDOWPOS}</td></tr></table>
	 */
	public static native int nSetWindowPos(long __functionAddress, long hWnd, long hWndInsertAfter, int X, int Y, int cx, int cy, int uFlags);

	/**
	 * Changes the size, position, and Z order of a child, pop-up, or top-level window. These windows are ordered according to their appearance on the screen.
	 * The topmost window receives the highest rank and is the first window in the Z order.
	 *
	 * @param hWnd            a handle to the window
	 * @param hWndInsertAfter a handle to the window to precede the positioned window in the Z order. This parameter must be a window handle or one of:<br><table><tr><td>{@link #HWND_TOP}</td><td>{@link #HWND_BOTTOM}</td><td>{@link #HWND_TOPMOST}</td><td>{@link #HWND_NOTOPMOST}</td></tr></table>
	 * @param X               the new position of the left side of the window, in client coordinates
	 * @param Y               the new position of the top of the window, in client coordinates
	 * @param cx              the new width of the window, in pixels
	 * @param cy              the new height of the window, in pixels
	 * @param uFlags          the window sizing and positioning flags. One or more of:<br><table><tr><td>{@link #SWP_NOSIZE}</td><td>{@link #SWP_NOMOVE}</td><td>{@link #SWP_NOZORDER}</td><td>{@link #SWP_NOREDRAW}</td><td>{@link #SWP_NOACTIVATE}</td></tr><tr><td>{@link #SWP_FRAMECHANGED}</td><td>{@link #SWP_SHOWWINDOW}</td><td>{@link #SWP_HIDEWINDOW}</td><td>{@link #SWP_NOCOPYBITS}</td><td>{@link #SWP_NOOWNERZORDER}</td></tr><tr><td>{@link #SWP_NOSENDCHANGING}</td><td>{@link #SWP_DRAWFRAME}</td><td>{@link #SWP_NOREPOSITION}</td><td>{@link #SWP_DEFERERASE}</td><td>{@link #SWP_ASYNCWINDOWPOS}</td></tr></table>
	 */
	public static boolean SetWindowPos(long hWnd, long hWndInsertAfter, int X, int Y, int cx, int cy, int uFlags) {
		long __functionAddress = Functions.SetWindowPos;
		if ( CHECKS )
			checkPointer(hWnd);
		return nSetWindowPos(__functionAddress, hWnd, hWndInsertAfter, X, Y, cx, cy, uFlags) != 0;
	}

	// --- [ SetWindowText ] ---

	/**
	 * Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed.
	 * However, {@code SetWindowText} cannot change the text of a control in another application.
	 *
	 * @param hWnd     a handle to the window or control whose text is to be changed
	 * @param lpString the new title or control text
	 */
	public static native int nSetWindowText(long __functionAddress, long hWnd, long lpString);

	/**
	 * Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed.
	 * However, {@code SetWindowText} cannot change the text of a control in another application.
	 *
	 * @param hWnd     a handle to the window or control whose text is to be changed
	 * @param lpString the new title or control text
	 */
	public static int nSetWindowText(long hWnd, long lpString) {
		long __functionAddress = Functions.SetWindowText;
		if ( CHECKS )
			checkPointer(hWnd);
		return nSetWindowText(__functionAddress, hWnd, lpString);
	}

	/**
	 * Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed.
	 * However, {@code SetWindowText} cannot change the text of a control in another application.
	 *
	 * @param hWnd     a handle to the window or control whose text is to be changed
	 * @param lpString the new title or control text
	 */
	public static boolean SetWindowText(long hWnd, ByteBuffer lpString) {
		if ( CHECKS )
			checkNT2(lpString);
		return nSetWindowText(hWnd, memAddress(lpString)) != 0;
	}

	/**
	 * Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed.
	 * However, {@code SetWindowText} cannot change the text of a control in another application.
	 *
	 * @param hWnd     a handle to the window or control whose text is to be changed
	 * @param lpString the new title or control text
	 */
	public static boolean SetWindowText(long hWnd, CharSequence lpString) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer lpStringEncoded = stack.UTF16(lpString);
			return nSetWindowText(hWnd, memAddress(lpStringEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ GetMessage ] ---

	/**
	 * Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
	 * retrieval. Unlike GetMessage, the {@link #PeekMessage} function does not wait for a message to be posted before returning.
	 *
	 * @param lpMsg         a pointer to an {@link MSG} structure that receives message information from the thread's message queue
	 * @param hWnd          a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 *                      
	 *                      <p>If {@code hWnd} is {@code NULL}, {@code GetMessage} retrieves messages for any window that belongs to the current thread, and any messages on the current
	 *                      thread's message queue whose {@code hwnd} value is {@code NULL} (see the {@link MSG} structure). Therefore if {@code hWnd} is {@code NULL}, both window messages and
	 *                      thread messages are processed.</p>
	 *                      
	 *                      <p>If {@code hWnd} is -1, {@code GetMessage} retrieves only messages on the current thread's message queue whose {@code hwnd} value is {@code NULL}, that is,
	 *                      thread messages as posted by {@link #PostMessage} (when the {@code hWnd} parameter is {@code NULL}) or {@code PostThreadMessage}.</p>
	 * @param wMsgFilterMin the integer value of the lowest message value to be retrieved
	 * @param wMsgFilterMax the integer value of the highest message value to be retrieved
	 */
	public static native int nGetMessage(long __functionAddress, long lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax);

	/**
	 * Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
	 * retrieval. Unlike GetMessage, the {@link #PeekMessage} function does not wait for a message to be posted before returning.
	 *
	 * @param lpMsg         a pointer to an {@link MSG} structure that receives message information from the thread's message queue
	 * @param hWnd          a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 *                      
	 *                      <p>If {@code hWnd} is {@code NULL}, {@code GetMessage} retrieves messages for any window that belongs to the current thread, and any messages on the current
	 *                      thread's message queue whose {@code hwnd} value is {@code NULL} (see the {@link MSG} structure). Therefore if {@code hWnd} is {@code NULL}, both window messages and
	 *                      thread messages are processed.</p>
	 *                      
	 *                      <p>If {@code hWnd} is -1, {@code GetMessage} retrieves only messages on the current thread's message queue whose {@code hwnd} value is {@code NULL}, that is,
	 *                      thread messages as posted by {@link #PostMessage} (when the {@code hWnd} parameter is {@code NULL}) or {@code PostThreadMessage}.</p>
	 * @param wMsgFilterMin the integer value of the lowest message value to be retrieved
	 * @param wMsgFilterMax the integer value of the highest message value to be retrieved
	 */
	public static int nGetMessage(long lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax) {
		long __functionAddress = Functions.GetMessage;
		return nGetMessage(__functionAddress, lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax);
	}

	/**
	 * Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
	 * retrieval. Unlike GetMessage, the {@link #PeekMessage} function does not wait for a message to be posted before returning.
	 *
	 * @param lpMsg         a pointer to an {@link MSG} structure that receives message information from the thread's message queue
	 * @param hWnd          a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 *                      
	 *                      <p>If {@code hWnd} is {@code NULL}, {@code GetMessage} retrieves messages for any window that belongs to the current thread, and any messages on the current
	 *                      thread's message queue whose {@code hwnd} value is {@code NULL} (see the {@link MSG} structure). Therefore if {@code hWnd} is {@code NULL}, both window messages and
	 *                      thread messages are processed.</p>
	 *                      
	 *                      <p>If {@code hWnd} is -1, {@code GetMessage} retrieves only messages on the current thread's message queue whose {@code hwnd} value is {@code NULL}, that is,
	 *                      thread messages as posted by {@link #PostMessage} (when the {@code hWnd} parameter is {@code NULL}) or {@code PostThreadMessage}.</p>
	 * @param wMsgFilterMin the integer value of the lowest message value to be retrieved
	 * @param wMsgFilterMax the integer value of the highest message value to be retrieved
	 */
	public static boolean GetMessage(MSG lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax) {
		return nGetMessage(lpMsg.address(), hWnd, wMsgFilterMin, wMsgFilterMax) != 0;
	}

	// --- [ PeekMessage ] ---

	/**
	 * Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).
	 *
	 * @param lpMsg         a pointer to an {@link MSG} structure that receives message information
	 * @param hWnd          a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 *                      
	 *                      <p>If {@code hWnd} is {@code NULL}, {@code GetMessage} retrieves messages for any window that belongs to the current thread, and any messages on the current
	 *                      thread's message queue whose {@code hwnd} value is {@code NULL} (see the {@link MSG} structure). Therefore if {@code hWnd} is {@code NULL}, both window messages and
	 *                      thread messages are processed.</p>
	 *                      
	 *                      <p>If {@code hWnd} is -1, {@code GetMessage} retrieves only messages on the current thread's message queue whose {@code hwnd} value is {@code NULL}, that is,
	 *                      thread messages as posted by {@link #PostMessage} (when the {@code hWnd} parameter is {@code NULL}) or {@code PostThreadMessage}.</p>
	 * @param wMsgFilterMin the integer value of the lowest message value to be retrieved
	 * @param wMsgFilterMax the integer value of the highest message value to be retrieved
	 * @param wRemoveMsg    specifies how messages are to be handled. One of:<br><table><tr><td>{@link #PM_NOREMOVE}</td><td>{@link #PM_REMOVE}</td><td>{@link #PM_NOYIELD}</td></tr></table>
	 */
	public static int nPeekMessage(long lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax, int wRemoveMsg) {
		long __functionAddress = Functions.PeekMessage;
		return callPPI(__functionAddress, lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax, wRemoveMsg);
	}

	/**
	 * Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).
	 *
	 * @param lpMsg         a pointer to an {@link MSG} structure that receives message information
	 * @param hWnd          a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 *                      
	 *                      <p>If {@code hWnd} is {@code NULL}, {@code GetMessage} retrieves messages for any window that belongs to the current thread, and any messages on the current
	 *                      thread's message queue whose {@code hwnd} value is {@code NULL} (see the {@link MSG} structure). Therefore if {@code hWnd} is {@code NULL}, both window messages and
	 *                      thread messages are processed.</p>
	 *                      
	 *                      <p>If {@code hWnd} is -1, {@code GetMessage} retrieves only messages on the current thread's message queue whose {@code hwnd} value is {@code NULL}, that is,
	 *                      thread messages as posted by {@link #PostMessage} (when the {@code hWnd} parameter is {@code NULL}) or {@code PostThreadMessage}.</p>
	 * @param wMsgFilterMin the integer value of the lowest message value to be retrieved
	 * @param wMsgFilterMax the integer value of the highest message value to be retrieved
	 * @param wRemoveMsg    specifies how messages are to be handled. One of:<br><table><tr><td>{@link #PM_NOREMOVE}</td><td>{@link #PM_REMOVE}</td><td>{@link #PM_NOYIELD}</td></tr></table>
	 */
	public static boolean PeekMessage(MSG lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax, int wRemoveMsg) {
		return nPeekMessage(lpMsg.address(), hWnd, wMsgFilterMin, wMsgFilterMax, wRemoveMsg) != 0;
	}

	// --- [ TranslateMessage ] ---

	/**
	 * Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
	 * time the thread calls the {@link #GetMessage} or {@link #PeekMessage} function.
	 *
	 * @param lpMsg an {@link MSG} structure that contains message information retrieved from the calling thread's message queue by using the {@link #GetMessage} or {@link #PeekMessage}
	 *              function.
	 */
	public static int nTranslateMessage(long lpMsg) {
		long __functionAddress = Functions.TranslateMessage;
		return callPI(__functionAddress, lpMsg);
	}

	/**
	 * Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
	 * time the thread calls the {@link #GetMessage} or {@link #PeekMessage} function.
	 *
	 * @param lpMsg an {@link MSG} structure that contains message information retrieved from the calling thread's message queue by using the {@link #GetMessage} or {@link #PeekMessage}
	 *              function.
	 */
	public static boolean TranslateMessage(MSG lpMsg) {
		return nTranslateMessage(lpMsg.address()) != 0;
	}

	// --- [ WaitMessage ] ---

	/**
	 * Yields control to other threads when a thread has no other messages in its message queue. The WaitMessage function suspends the thread and does not
	 * return until a new message is placed in the thread's message queue.
	 */
	public static native int nWaitMessage(long __functionAddress);

	/**
	 * Yields control to other threads when a thread has no other messages in its message queue. The WaitMessage function suspends the thread and does not
	 * return until a new message is placed in the thread's message queue.
	 */
	public static boolean WaitMessage() {
		long __functionAddress = Functions.WaitMessage;
		return nWaitMessage(__functionAddress) != 0;
	}

	// --- [ DispatchMessage ] ---

	/**
	 * Dispatches a message to a window procedure. It is typically used to dispatch a message retrieved by the {@link #GetMessage} function.
	 *
	 * @param lpmsg a pointer to a structure that contains the message.
	 */
	public static long nDispatchMessage(long lpmsg) {
		long __functionAddress = Functions.DispatchMessage;
		return callPP(__functionAddress, lpmsg);
	}

	/**
	 * Dispatches a message to a window procedure. It is typically used to dispatch a message retrieved by the {@link #GetMessage} function.
	 *
	 * @param lpmsg a pointer to a structure that contains the message.
	 */
	public static long DispatchMessage(MSG lpmsg) {
		return nDispatchMessage(lpmsg.address());
	}

	// --- [ PostMessage ] ---

	/**
	 * Places (posts) a message in the message queue associated with the thread that created the specified window and returns without waiting for the thread
	 * to process the message.
	 *
	 * @param hWnd   a handle to the window whose window procedure is to receive the message. The following values have special meanings:
	 *               
	 *               <ul>
	 *               <li>{@link #HWND_BROADCAST} - The message is posted to all top-level windows in the system, including disabled or invisible unowned windows, overlapped
	 *               windows, and pop-up windows. The message is not posted to child windows.</li>
	 *               <li>{@code NULL} - The function behaves like a call to PostThreadMessage with the dwThreadId parameter set to the identifier of the current thread.</li>
	 *               </ul>
	 * @param Msg    the message to be posted
	 * @param wParam additional message-specific information
	 * @param lParam additional message-specific information
	 */
	public static native int nPostMessage(long __functionAddress, long hWnd, int Msg, long wParam, long lParam);

	/**
	 * Places (posts) a message in the message queue associated with the thread that created the specified window and returns without waiting for the thread
	 * to process the message.
	 *
	 * @param hWnd   a handle to the window whose window procedure is to receive the message. The following values have special meanings:
	 *               
	 *               <ul>
	 *               <li>{@link #HWND_BROADCAST} - The message is posted to all top-level windows in the system, including disabled or invisible unowned windows, overlapped
	 *               windows, and pop-up windows. The message is not posted to child windows.</li>
	 *               <li>{@code NULL} - The function behaves like a call to PostThreadMessage with the dwThreadId parameter set to the identifier of the current thread.</li>
	 *               </ul>
	 * @param Msg    the message to be posted
	 * @param wParam additional message-specific information
	 * @param lParam additional message-specific information
	 */
	public static boolean PostMessage(long hWnd, int Msg, long wParam, long lParam) {
		long __functionAddress = Functions.PostMessage;
		return nPostMessage(__functionAddress, hWnd, Msg, wParam, lParam) != 0;
	}

	// --- [ SendMessage ] ---

	/**
	 * Sends the specified message to a window or windows. The {@code SendMessage} function calls the window procedure for the specified window and does not
	 * return until the window procedure has processed the message.
	 *
	 * @param hWnd   a handle to the window whose window procedure will receive the message. If this parameter is {@link #HWND_BROADCAST}, the message is sent to all top-level
	 *               windows in the system, including disabled or invisible unowned windows, overlapped windows, and pop-up windows; but the message is not sent to
	 *               child windows.
	 *               
	 *               <p>Message sending is subject to UIPI. The thread of a process can send messages only to message queues of threads in processes of lesser or equal
	 *               integrity level.</p>
	 * @param Msg    the message to be sent
	 * @param wParam additional message-specific information
	 * @param lParam additional message-specific information
	 */
	public static native int nSendMessage(long __functionAddress, long hWnd, int Msg, long wParam, long lParam);

	/**
	 * Sends the specified message to a window or windows. The {@code SendMessage} function calls the window procedure for the specified window and does not
	 * return until the window procedure has processed the message.
	 *
	 * @param hWnd   a handle to the window whose window procedure will receive the message. If this parameter is {@link #HWND_BROADCAST}, the message is sent to all top-level
	 *               windows in the system, including disabled or invisible unowned windows, overlapped windows, and pop-up windows; but the message is not sent to
	 *               child windows.
	 *               
	 *               <p>Message sending is subject to UIPI. The thread of a process can send messages only to message queues of threads in processes of lesser or equal
	 *               integrity level.</p>
	 * @param Msg    the message to be sent
	 * @param wParam additional message-specific information
	 * @param lParam additional message-specific information
	 */
	public static boolean SendMessage(long hWnd, int Msg, long wParam, long lParam) {
		long __functionAddress = Functions.SendMessage;
		if ( CHECKS )
			checkPointer(hWnd);
		return nSendMessage(__functionAddress, hWnd, Msg, wParam, lParam) != 0;
	}

	// --- [ AdjustWindowRectEx ] ---

	/**
	 * Calculates the required size of the window rectangle, based on the desired size of the client rectangle. The window rectangle can then be passed to the
	 * {@link #CreateWindowEx} function to create a window whose client area is the desired size.
	 *
	 * @param lpRect    a pointer to a {@link RECT} structure that contains the coordinates of the top-left and bottom-right corners of the desired client area. When the
	 *                  function returns, the structure contains the coordinates of the top-left and bottom-right corners of the window to accommodate the desired client
	 *                  area.
	 * @param dwStyle   the window style of the window whose required size is to be calculated. Note that you cannot specify the {@link #WS_OVERLAPPED} style.
	 * @param bMenu     indicates whether the window has a menu
	 * @param dwExStyle the extended window style of the window whose required size is to be calculated
	 */
	public static native int nAdjustWindowRectEx(long __functionAddress, long lpRect, int dwStyle, int bMenu, int dwExStyle);

	/**
	 * Calculates the required size of the window rectangle, based on the desired size of the client rectangle. The window rectangle can then be passed to the
	 * {@link #CreateWindowEx} function to create a window whose client area is the desired size.
	 *
	 * @param lpRect    a pointer to a {@link RECT} structure that contains the coordinates of the top-left and bottom-right corners of the desired client area. When the
	 *                  function returns, the structure contains the coordinates of the top-left and bottom-right corners of the window to accommodate the desired client
	 *                  area.
	 * @param dwStyle   the window style of the window whose required size is to be calculated. Note that you cannot specify the {@link #WS_OVERLAPPED} style.
	 * @param bMenu     indicates whether the window has a menu
	 * @param dwExStyle the extended window style of the window whose required size is to be calculated
	 */
	public static int nAdjustWindowRectEx(long lpRect, int dwStyle, int bMenu, int dwExStyle) {
		long __functionAddress = Functions.AdjustWindowRectEx;
		return nAdjustWindowRectEx(__functionAddress, lpRect, dwStyle, bMenu, dwExStyle);
	}

	/**
	 * Calculates the required size of the window rectangle, based on the desired size of the client rectangle. The window rectangle can then be passed to the
	 * {@link #CreateWindowEx} function to create a window whose client area is the desired size.
	 *
	 * @param lpRect    a pointer to a {@link RECT} structure that contains the coordinates of the top-left and bottom-right corners of the desired client area. When the
	 *                  function returns, the structure contains the coordinates of the top-left and bottom-right corners of the window to accommodate the desired client
	 *                  area.
	 * @param dwStyle   the window style of the window whose required size is to be calculated. Note that you cannot specify the {@link #WS_OVERLAPPED} style.
	 * @param bMenu     indicates whether the window has a menu
	 * @param dwExStyle the extended window style of the window whose required size is to be calculated
	 */
	public static boolean AdjustWindowRectEx(RECT lpRect, int dwStyle, boolean bMenu, int dwExStyle) {
		return nAdjustWindowRectEx(lpRect.address(), dwStyle, bMenu ? 1 : 0, dwExStyle) != 0;
	}

	// --- [ GetWindowRect ] ---

	/**
	 * Retrieves the dimensions of the bounding rectangle of the specified window. The dimensions are given in screen coordinates that are relative to the
	 * upper-left corner of the screen.
	 *
	 * @param hWnd   a handle to the window
	 * @param lpRect a pointer to a {@link RECT} structure that receives the screen coordinates of the upper-left and lower-right corners of the window
	 */
	public static native int nGetWindowRect(long __functionAddress, long hWnd, long lpRect);

	/**
	 * Retrieves the dimensions of the bounding rectangle of the specified window. The dimensions are given in screen coordinates that are relative to the
	 * upper-left corner of the screen.
	 *
	 * @param hWnd   a handle to the window
	 * @param lpRect a pointer to a {@link RECT} structure that receives the screen coordinates of the upper-left and lower-right corners of the window
	 */
	public static int nGetWindowRect(long hWnd, long lpRect) {
		long __functionAddress = Functions.GetWindowRect;
		if ( CHECKS )
			checkPointer(hWnd);
		return nGetWindowRect(__functionAddress, hWnd, lpRect);
	}

	/**
	 * Retrieves the dimensions of the bounding rectangle of the specified window. The dimensions are given in screen coordinates that are relative to the
	 * upper-left corner of the screen.
	 *
	 * @param hWnd   a handle to the window
	 * @param lpRect a pointer to a {@link RECT} structure that receives the screen coordinates of the upper-left and lower-right corners of the window
	 */
	public static boolean GetWindowRect(long hWnd, RECT lpRect) {
		return nGetWindowRect(hWnd, lpRect.address()) != 0;
	}

	// --- [ MoveWindow ] ---

	/**
	 * Changes the position and dimensions of the specified window. For a top-level window, the position and dimensions are relative to the upper-left corner
	 * of the screen. For a child window, they are relative to the upper-left corner of the parent window's client area.
	 *
	 * @param hWnd     a handle to the window
	 * @param X        the new position of the left side of the window
	 * @param Y        the new position of the top of the window
	 * @param nWidth   the new width of the window
	 * @param nHeight  the new height of the window
	 * @param bRepaint indicates whether the window is to be repainted. If this parameter is TRUE, the window receives a message. If the parameter is FALSE, no repainting
	 *                 of any kind occurs. This applies to the client area, the nonclient area (including the title bar and scroll bars), and any part of the parent
	 *                 window uncovered as a result of moving a child window.
	 */
	public static native int nMoveWindow(long __functionAddress, long hWnd, int X, int Y, int nWidth, int nHeight, int bRepaint);

	/**
	 * Changes the position and dimensions of the specified window. For a top-level window, the position and dimensions are relative to the upper-left corner
	 * of the screen. For a child window, they are relative to the upper-left corner of the parent window's client area.
	 *
	 * @param hWnd     a handle to the window
	 * @param X        the new position of the left side of the window
	 * @param Y        the new position of the top of the window
	 * @param nWidth   the new width of the window
	 * @param nHeight  the new height of the window
	 * @param bRepaint indicates whether the window is to be repainted. If this parameter is TRUE, the window receives a message. If the parameter is FALSE, no repainting
	 *                 of any kind occurs. This applies to the client area, the nonclient area (including the title bar and scroll bars), and any part of the parent
	 *                 window uncovered as a result of moving a child window.
	 */
	public static boolean MoveWindow(long hWnd, int X, int Y, int nWidth, int nHeight, boolean bRepaint) {
		long __functionAddress = Functions.MoveWindow;
		if ( CHECKS )
			checkPointer(hWnd);
		return nMoveWindow(__functionAddress, hWnd, X, Y, nWidth, nHeight, bRepaint ? 1 : 0) != 0;
	}

	// --- [ GetWindowPlacement ] ---

	/**
	 * Retrieves the show state and the restored, minimized, and maximized positions of the specified window.
	 *
	 * @param hWnd    a handle to the window
	 * @param lpwndpl a pointer to the {@link WINDOWPLACEMENT} structure that receives the show state and position information.
	 *                
	 *                <p>Before calling {@code GetWindowPlacement}, set the length member to {@link WINDOWPLACEMENT#SIZEOF}. {@code GetWindowPlacement} fails if
	 *                {@code lpwndpl->length} is not set correctly.</p>
	 */
	public static native int nGetWindowPlacement(long __functionAddress, long hWnd, long lpwndpl);

	/**
	 * Retrieves the show state and the restored, minimized, and maximized positions of the specified window.
	 *
	 * @param hWnd    a handle to the window
	 * @param lpwndpl a pointer to the {@link WINDOWPLACEMENT} structure that receives the show state and position information.
	 *                
	 *                <p>Before calling {@code GetWindowPlacement}, set the length member to {@link WINDOWPLACEMENT#SIZEOF}. {@code GetWindowPlacement} fails if
	 *                {@code lpwndpl->length} is not set correctly.</p>
	 */
	public static int nGetWindowPlacement(long hWnd, long lpwndpl) {
		long __functionAddress = Functions.GetWindowPlacement;
		if ( CHECKS )
			checkPointer(hWnd);
		return nGetWindowPlacement(__functionAddress, hWnd, lpwndpl);
	}

	/**
	 * Retrieves the show state and the restored, minimized, and maximized positions of the specified window.
	 *
	 * @param hWnd    a handle to the window
	 * @param lpwndpl a pointer to the {@link WINDOWPLACEMENT} structure that receives the show state and position information.
	 *                
	 *                <p>Before calling {@code GetWindowPlacement}, set the length member to {@link WINDOWPLACEMENT#SIZEOF}. {@code GetWindowPlacement} fails if
	 *                {@code lpwndpl->length} is not set correctly.</p>
	 */
	public static boolean GetWindowPlacement(long hWnd, WINDOWPLACEMENT lpwndpl) {
		return nGetWindowPlacement(hWnd, lpwndpl.address()) != 0;
	}

	// --- [ SetWindowPlacement ] ---

	/**
	 * Sets the show state and the restored, minimized, and maximized positions of the specified window.
	 *
	 * @param hWnd    a handle to the window
	 * @param lpwndpl a pointer to the {@link WINDOWPLACEMENT} structure that specifies the new show state and window positions.
	 *                
	 *                <p>Before calling {@code SetWindowPlacement}, set the {@code length} member of the {@code WINDOWPLACEMENT} structure to {@link WINDOWPLACEMENT#SIZEOF}.
	 *                {@code SetWindowPlacement} fails if the length member is not set correctly.</p>
	 */
	public static native int nSetWindowPlacement(long __functionAddress, long hWnd, long lpwndpl);

	/**
	 * Sets the show state and the restored, minimized, and maximized positions of the specified window.
	 *
	 * @param hWnd    a handle to the window
	 * @param lpwndpl a pointer to the {@link WINDOWPLACEMENT} structure that specifies the new show state and window positions.
	 *                
	 *                <p>Before calling {@code SetWindowPlacement}, set the {@code length} member of the {@code WINDOWPLACEMENT} structure to {@link WINDOWPLACEMENT#SIZEOF}.
	 *                {@code SetWindowPlacement} fails if the length member is not set correctly.</p>
	 */
	public static int nSetWindowPlacement(long hWnd, long lpwndpl) {
		long __functionAddress = Functions.SetWindowPlacement;
		if ( CHECKS )
			checkPointer(hWnd);
		return nSetWindowPlacement(__functionAddress, hWnd, lpwndpl);
	}

	/**
	 * Sets the show state and the restored, minimized, and maximized positions of the specified window.
	 *
	 * @param hWnd    a handle to the window
	 * @param lpwndpl a pointer to the {@link WINDOWPLACEMENT} structure that specifies the new show state and window positions.
	 *                
	 *                <p>Before calling {@code SetWindowPlacement}, set the {@code length} member of the {@code WINDOWPLACEMENT} structure to {@link WINDOWPLACEMENT#SIZEOF}.
	 *                {@code SetWindowPlacement} fails if the length member is not set correctly.</p>
	 */
	public static boolean SetWindowPlacement(long hWnd, WINDOWPLACEMENT lpwndpl) {
		return nSetWindowPlacement(hWnd, lpwndpl.address()) != 0;
	}

	// --- [ IsWindowVisible ] ---

	/**
	 * Determines the visibility state of the specified window.
	 *
	 * @param hWnd a handle to the window to be tested
	 */
	public static boolean IsWindowVisible(long hWnd) {
		long __functionAddress = Functions.IsWindowVisible;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPI(__functionAddress, hWnd) != 0;
	}

	// --- [ IsIconic ] ---

	/**
	 * Determines whether the specified window is minimized (iconic).
	 *
	 * @param hWnd a handle to the window to be tested
	 */
	public static boolean IsIconic(long hWnd) {
		long __functionAddress = Functions.IsIconic;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPI(__functionAddress, hWnd) != 0;
	}

	// --- [ IsZoomed ] ---

	/**
	 * Determines whether a window is maximized.
	 *
	 * @param hWnd a handle to the window to be tested
	 */
	public static boolean IsZoomed(long hWnd) {
		long __functionAddress = Functions.IsZoomed;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPI(__functionAddress, hWnd) != 0;
	}

	// --- [ BringWindowToTop ] ---

	/**
	 * Brings the specified window to the top of the Z order. If the window is a top-level window, it is activated. If the window is a child window, the
	 * top-level parent window associated with the child window is activated.
	 *
	 * @param hWnd a handle to the window to bring to the top of the Z order
	 */
	public static boolean BringWindowToTop(long hWnd) {
		long __functionAddress = Functions.BringWindowToTop;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPI(__functionAddress, hWnd) != 0;
	}

	// --- [ SetWindowLongPtr ] ---

	/**
	 * Changes an attribute of the specified window. The function also sets a value at the specified offset in the extra window memory.
	 *
	 * @param hWnd      a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex    the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
	 *                  of an integer. To set any other value, specify one of:<br><table><tr><td>{@link #GWL_WNDPROC}</td><td>{@link #GWL_HINSTANCE}</td><td>{@link #GWL_HWNDPARENT}</td><td>{@link #GWL_STYLE}</td><td>{@link #GWL_EXSTYLE}</td><td>{@link #GWL_USERDATA}</td><td>{@link #GWL_ID}</td></tr></table>
	 * @param dwNewLong the replacement value
	 *
	 * @return the previous value at the given {@code index}
	 */
	public static native long nSetWindowLongPtr(long __functionAddress, long hWnd, int nIndex, long dwNewLong);

	/**
	 * Changes an attribute of the specified window. The function also sets a value at the specified offset in the extra window memory.
	 *
	 * @param hWnd      a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex    the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
	 *                  of an integer. To set any other value, specify one of:<br><table><tr><td>{@link #GWL_WNDPROC}</td><td>{@link #GWL_HINSTANCE}</td><td>{@link #GWL_HWNDPARENT}</td><td>{@link #GWL_STYLE}</td><td>{@link #GWL_EXSTYLE}</td><td>{@link #GWL_USERDATA}</td><td>{@link #GWL_ID}</td></tr></table>
	 * @param dwNewLong the replacement value
	 *
	 * @return the previous value at the given {@code index}
	 */
	public static long SetWindowLongPtr(long hWnd, int nIndex, long dwNewLong) {
		long __functionAddress = Functions.SetWindowLongPtr;
		if ( CHECKS )
			checkPointer(hWnd);
		return nSetWindowLongPtr(__functionAddress, hWnd, nIndex, dwNewLong);
	}

	// --- [ GetWindowLongPtr ] ---

	/**
	 * Retrieves information about the specified window. The function also retrieves the value at a specified offset into the extra window memory.
	 *
	 * @param hWnd   a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
	 *               of an integer. To set any other value, specify one of:<br><table><tr><td>{@link #GWL_WNDPROC}</td><td>{@link #GWL_HINSTANCE}</td><td>{@link #GWL_HWNDPARENT}</td><td>{@link #GWL_STYLE}</td><td>{@link #GWL_EXSTYLE}</td><td>{@link #GWL_USERDATA}</td><td>{@link #GWL_ID}</td></tr></table>
	 */
	public static native long nGetWindowLongPtr(long __functionAddress, long hWnd, int nIndex);

	/**
	 * Retrieves information about the specified window. The function also retrieves the value at a specified offset into the extra window memory.
	 *
	 * @param hWnd   a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
	 *               of an integer. To set any other value, specify one of:<br><table><tr><td>{@link #GWL_WNDPROC}</td><td>{@link #GWL_HINSTANCE}</td><td>{@link #GWL_HWNDPARENT}</td><td>{@link #GWL_STYLE}</td><td>{@link #GWL_EXSTYLE}</td><td>{@link #GWL_USERDATA}</td><td>{@link #GWL_ID}</td></tr></table>
	 */
	public static long GetWindowLongPtr(long hWnd, int nIndex) {
		long __functionAddress = Functions.GetWindowLongPtr;
		if ( CHECKS )
			checkPointer(hWnd);
		return nGetWindowLongPtr(__functionAddress, hWnd, nIndex);
	}

	// --- [ SetClassLongPtr ] ---

	/**
	 * Replaces the specified value at the specified offset in the extra class memory or the {@link WNDCLASSEX} structure for the class to which the specified
	 * window belongs.
	 *
	 * @param hWnd      a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex    the value to be replaced. To set a value in the extra class memory, specify the positive, zero-based byte offset of the value to be set. Valid
	 *                  values are in the range zero through the number of bytes of extra class memory, minus eight; for example, if you specified 24 or more bytes of
	 *                  extra class memory, a value of 16 would be an index to the third integer. To set a value other than the {@link WNDCLASSEX} structure, specify one of:<br><table><tr><td>{@link #GCL_MENUNAME}</td><td>{@link #GCL_HBRBACKGROUND}</td><td>{@link #GCL_HCURSOR}</td><td>{@link #GCL_HICON}</td><td>{@link #GCL_HMODULE}</td><td>{@link #GCL_CBWNDEXTRA}</td></tr><tr><td>{@link #GCL_CBCLSEXTRA}</td><td>{@link #GCL_WNDPROC}</td><td>{@link #GCL_STYLE}</td><td>{@link #GCW_ATOM}</td><td>{@link #GCL_HICONSM}</td></tr></table>
	 * @param dwNewLong the replacement value
	 *
	 * @return if the function succeeds, the return value is the previous value of the specified offset. If this was not previously set, the return value is zero.
	 *         
	 *         <p>If the function fails, the return value is zero. To get extended error information, call {@link WinBase#getLastError}.</p>
	 */
	public static native long nSetClassLongPtr(long __functionAddress, long hWnd, int nIndex, long dwNewLong);

	/**
	 * Replaces the specified value at the specified offset in the extra class memory or the {@link WNDCLASSEX} structure for the class to which the specified
	 * window belongs.
	 *
	 * @param hWnd      a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex    the value to be replaced. To set a value in the extra class memory, specify the positive, zero-based byte offset of the value to be set. Valid
	 *                  values are in the range zero through the number of bytes of extra class memory, minus eight; for example, if you specified 24 or more bytes of
	 *                  extra class memory, a value of 16 would be an index to the third integer. To set a value other than the {@link WNDCLASSEX} structure, specify one of:<br><table><tr><td>{@link #GCL_MENUNAME}</td><td>{@link #GCL_HBRBACKGROUND}</td><td>{@link #GCL_HCURSOR}</td><td>{@link #GCL_HICON}</td><td>{@link #GCL_HMODULE}</td><td>{@link #GCL_CBWNDEXTRA}</td></tr><tr><td>{@link #GCL_CBCLSEXTRA}</td><td>{@link #GCL_WNDPROC}</td><td>{@link #GCL_STYLE}</td><td>{@link #GCW_ATOM}</td><td>{@link #GCL_HICONSM}</td></tr></table>
	 * @param dwNewLong the replacement value
	 *
	 * @return if the function succeeds, the return value is the previous value of the specified offset. If this was not previously set, the return value is zero.
	 *         
	 *         <p>If the function fails, the return value is zero. To get extended error information, call {@link WinBase#getLastError}.</p>
	 */
	public static long SetClassLongPtr(long hWnd, int nIndex, long dwNewLong) {
		long __functionAddress = Functions.SetClassLongPtr;
		if ( CHECKS )
			checkPointer(hWnd);
		return nSetClassLongPtr(__functionAddress, hWnd, nIndex, dwNewLong);
	}

	// --- [ GetClassLongPtr ] ---

	/**
	 * Retrieves the specified value from the {@link WNDCLASSEX} structure associated with the specified window.
	 *
	 * @param hWnd   a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex the value to be retrieved. To retrieve a value from the extra class memory, specify the positive, zero-based byte offset of the value to be
	 *               retrieved. Valid values are in the range zero through the number of bytes of extra class memory, minus eight; for example, if you specified 24 or
	 *               more bytes of extra class memory, a value of 16 would be an index to the third integer. To retrieve any other value from the {@link WNDCLASSEX}
	 *               structure, specify one of:<br><table><tr><td>{@link #GCL_MENUNAME}</td><td>{@link #GCL_HBRBACKGROUND}</td><td>{@link #GCL_HCURSOR}</td><td>{@link #GCL_HICON}</td><td>{@link #GCL_HMODULE}</td><td>{@link #GCL_CBWNDEXTRA}</td></tr><tr><td>{@link #GCL_CBCLSEXTRA}</td><td>{@link #GCL_WNDPROC}</td><td>{@link #GCL_STYLE}</td><td>{@link #GCW_ATOM}</td><td>{@link #GCL_HICONSM}</td></tr></table>
	 */
	public static native long nGetClassLongPtr(long __functionAddress, long hWnd, int nIndex);

	/**
	 * Retrieves the specified value from the {@link WNDCLASSEX} structure associated with the specified window.
	 *
	 * @param hWnd   a handle to the window and, indirectly, the class to which the window belongs
	 * @param nIndex the value to be retrieved. To retrieve a value from the extra class memory, specify the positive, zero-based byte offset of the value to be
	 *               retrieved. Valid values are in the range zero through the number of bytes of extra class memory, minus eight; for example, if you specified 24 or
	 *               more bytes of extra class memory, a value of 16 would be an index to the third integer. To retrieve any other value from the {@link WNDCLASSEX}
	 *               structure, specify one of:<br><table><tr><td>{@link #GCL_MENUNAME}</td><td>{@link #GCL_HBRBACKGROUND}</td><td>{@link #GCL_HCURSOR}</td><td>{@link #GCL_HICON}</td><td>{@link #GCL_HMODULE}</td><td>{@link #GCL_CBWNDEXTRA}</td></tr><tr><td>{@link #GCL_CBCLSEXTRA}</td><td>{@link #GCL_WNDPROC}</td><td>{@link #GCL_STYLE}</td><td>{@link #GCW_ATOM}</td><td>{@link #GCL_HICONSM}</td></tr></table>
	 */
	public static long GetClassLongPtr(long hWnd, int nIndex) {
		long __functionAddress = Functions.GetClassLongPtr;
		if ( CHECKS )
			checkPointer(hWnd);
		return nGetClassLongPtr(__functionAddress, hWnd, nIndex);
	}

	// --- [ SetLayeredWindowAttributes ] ---

	/**
	 * 
	 *
	 * @param hwnd    a handle to the layered window. A layered window is created by specifying {@link #WS_EX_LAYERED} when creating the window with the {@link #CreateWindowEx}
	 *                function or by setting {@link #WS_EX_LAYERED} via {@link #SetWindowLongPtr} after the window has been created.
	 * @param crKey   the transparency color key (0x00bbggrr) to be used when composing the layered window. All pixels painted by the window in this color will be
	 *                transparent.
	 * @param bAlpha  the alpha value used to describe the opacity of the layered window. When {@code bAlpha} is 0, the window is completely transparent. When
	 *                {@code bAlpha} is 255, the window is opaque.
	 * @param dwFlags an action to be taken. One or more of:<br><table><tr><td>{@link #LWA_COLORKEY}</td><td>{@link #LWA_ALPHA}</td></tr></table>
	 */
	public static native int nSetLayeredWindowAttributes(long __functionAddress, long hwnd, int crKey, byte bAlpha, int dwFlags);

	/**
	 * 
	 *
	 * @param hwnd    a handle to the layered window. A layered window is created by specifying {@link #WS_EX_LAYERED} when creating the window with the {@link #CreateWindowEx}
	 *                function or by setting {@link #WS_EX_LAYERED} via {@link #SetWindowLongPtr} after the window has been created.
	 * @param crKey   the transparency color key (0x00bbggrr) to be used when composing the layered window. All pixels painted by the window in this color will be
	 *                transparent.
	 * @param bAlpha  the alpha value used to describe the opacity of the layered window. When {@code bAlpha} is 0, the window is completely transparent. When
	 *                {@code bAlpha} is 255, the window is opaque.
	 * @param dwFlags an action to be taken. One or more of:<br><table><tr><td>{@link #LWA_COLORKEY}</td><td>{@link #LWA_ALPHA}</td></tr></table>
	 */
	public static boolean SetLayeredWindowAttributes(long hwnd, int crKey, byte bAlpha, int dwFlags) {
		long __functionAddress = Functions.SetLayeredWindowAttributes;
		if ( CHECKS )
			checkPointer(hwnd);
		return nSetLayeredWindowAttributes(__functionAddress, hwnd, crKey, bAlpha, dwFlags) != 0;
	}

	// --- [ LoadIcon ] ---

	/**
	 * Loads the specified icon resource from the executable (.exe) file associated with an application instance.
	 *
	 * @param instance a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be {@code NULL} when a standard icon is
	 *                 being loaded.
	 * @param iconName the name of the icon resource to be loaded or one of:<br><table><tr><td>{@link #IDI_APPLICATION}</td><td>{@link #IDI_HAND}</td><td>{@link #IDI_QUESTION}</td><td>{@link #IDI_EXCLAMATION}</td><td>{@link #IDI_ASTERISK}</td><td>{@link #IDI_WINLOGO}</td></tr><tr><td>{@link #IDI_SHIELD}</td><td>{@link #IDI_WARNING}</td><td>{@link #IDI_ERROR}</td><td>{@link #IDI_INFORMATION}</td></tr></table>
	 */
	public static native long nLoadIcon(long __functionAddress, long instance, long iconName);

	/**
	 * Loads the specified icon resource from the executable (.exe) file associated with an application instance.
	 *
	 * @param instance a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be {@code NULL} when a standard icon is
	 *                 being loaded.
	 * @param iconName the name of the icon resource to be loaded or one of:<br><table><tr><td>{@link #IDI_APPLICATION}</td><td>{@link #IDI_HAND}</td><td>{@link #IDI_QUESTION}</td><td>{@link #IDI_EXCLAMATION}</td><td>{@link #IDI_ASTERISK}</td><td>{@link #IDI_WINLOGO}</td></tr><tr><td>{@link #IDI_SHIELD}</td><td>{@link #IDI_WARNING}</td><td>{@link #IDI_ERROR}</td><td>{@link #IDI_INFORMATION}</td></tr></table>
	 */
	public static long nLoadIcon(long instance, long iconName) {
		long __functionAddress = Functions.LoadIcon;
		return nLoadIcon(__functionAddress, instance, iconName);
	}

	/**
	 * Loads the specified icon resource from the executable (.exe) file associated with an application instance.
	 *
	 * @param instance a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be {@code NULL} when a standard icon is
	 *                 being loaded.
	 * @param iconName the name of the icon resource to be loaded or one of:<br><table><tr><td>{@link #IDI_APPLICATION}</td><td>{@link #IDI_HAND}</td><td>{@link #IDI_QUESTION}</td><td>{@link #IDI_EXCLAMATION}</td><td>{@link #IDI_ASTERISK}</td><td>{@link #IDI_WINLOGO}</td></tr><tr><td>{@link #IDI_SHIELD}</td><td>{@link #IDI_WARNING}</td><td>{@link #IDI_ERROR}</td><td>{@link #IDI_INFORMATION}</td></tr></table>
	 */
	public static long LoadIcon(long instance, ByteBuffer iconName) {
		if ( CHECKS )
			checkNT2(iconName);
		return nLoadIcon(instance, memAddress(iconName));
	}

	/**
	 * Loads the specified icon resource from the executable (.exe) file associated with an application instance.
	 *
	 * @param instance a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be {@code NULL} when a standard icon is
	 *                 being loaded.
	 * @param iconName the name of the icon resource to be loaded or one of:<br><table><tr><td>{@link #IDI_APPLICATION}</td><td>{@link #IDI_HAND}</td><td>{@link #IDI_QUESTION}</td><td>{@link #IDI_EXCLAMATION}</td><td>{@link #IDI_ASTERISK}</td><td>{@link #IDI_WINLOGO}</td></tr><tr><td>{@link #IDI_SHIELD}</td><td>{@link #IDI_WARNING}</td><td>{@link #IDI_ERROR}</td><td>{@link #IDI_INFORMATION}</td></tr></table>
	 */
	public static long LoadIcon(long instance, CharSequence iconName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer iconNameEncoded = stack.UTF16(iconName);
			return nLoadIcon(instance, memAddress(iconNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ LoadCursor ] ---

	/**
	 * Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.
	 *
	 * @param instance   a handle to an instance of the module whose executable file contains the cursor to be loaded.
	 * @param cursorName the name of the cursor resource to be loaded or one of:<br><table><tr><td>{@link #IDC_ARROW}</td><td>{@link #IDC_IBEAM}</td><td>{@link #IDC_WAIT}</td><td>{@link #IDC_CROSS}</td><td>{@link #IDC_UPARROW}</td><td>{@link #IDC_SIZE}</td><td>{@link #IDC_ICON}</td><td>{@link #IDC_SIZENWSE}</td></tr><tr><td>{@link #IDC_SIZENESW}</td><td>{@link #IDC_SIZEWE}</td><td>{@link #IDC_SIZENS}</td><td>{@link #IDC_SIZEALL}</td><td>{@link #IDC_NO}</td><td>{@link #IDC_HAND}</td><td>{@link #IDC_APPSTARTING}</td><td>{@link #IDC_HELP}</td></tr></table>
	 */
	public static native long nLoadCursor(long __functionAddress, long instance, long cursorName);

	/**
	 * Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.
	 *
	 * @param instance   a handle to an instance of the module whose executable file contains the cursor to be loaded.
	 * @param cursorName the name of the cursor resource to be loaded or one of:<br><table><tr><td>{@link #IDC_ARROW}</td><td>{@link #IDC_IBEAM}</td><td>{@link #IDC_WAIT}</td><td>{@link #IDC_CROSS}</td><td>{@link #IDC_UPARROW}</td><td>{@link #IDC_SIZE}</td><td>{@link #IDC_ICON}</td><td>{@link #IDC_SIZENWSE}</td></tr><tr><td>{@link #IDC_SIZENESW}</td><td>{@link #IDC_SIZEWE}</td><td>{@link #IDC_SIZENS}</td><td>{@link #IDC_SIZEALL}</td><td>{@link #IDC_NO}</td><td>{@link #IDC_HAND}</td><td>{@link #IDC_APPSTARTING}</td><td>{@link #IDC_HELP}</td></tr></table>
	 */
	public static long nLoadCursor(long instance, long cursorName) {
		long __functionAddress = Functions.LoadCursor;
		return nLoadCursor(__functionAddress, instance, cursorName);
	}

	/**
	 * Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.
	 *
	 * @param instance   a handle to an instance of the module whose executable file contains the cursor to be loaded.
	 * @param cursorName the name of the cursor resource to be loaded or one of:<br><table><tr><td>{@link #IDC_ARROW}</td><td>{@link #IDC_IBEAM}</td><td>{@link #IDC_WAIT}</td><td>{@link #IDC_CROSS}</td><td>{@link #IDC_UPARROW}</td><td>{@link #IDC_SIZE}</td><td>{@link #IDC_ICON}</td><td>{@link #IDC_SIZENWSE}</td></tr><tr><td>{@link #IDC_SIZENESW}</td><td>{@link #IDC_SIZEWE}</td><td>{@link #IDC_SIZENS}</td><td>{@link #IDC_SIZEALL}</td><td>{@link #IDC_NO}</td><td>{@link #IDC_HAND}</td><td>{@link #IDC_APPSTARTING}</td><td>{@link #IDC_HELP}</td></tr></table>
	 */
	public static long LoadCursor(long instance, ByteBuffer cursorName) {
		if ( CHECKS )
			checkNT2(cursorName);
		return nLoadCursor(instance, memAddress(cursorName));
	}

	/**
	 * Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.
	 *
	 * @param instance   a handle to an instance of the module whose executable file contains the cursor to be loaded.
	 * @param cursorName the name of the cursor resource to be loaded or one of:<br><table><tr><td>{@link #IDC_ARROW}</td><td>{@link #IDC_IBEAM}</td><td>{@link #IDC_WAIT}</td><td>{@link #IDC_CROSS}</td><td>{@link #IDC_UPARROW}</td><td>{@link #IDC_SIZE}</td><td>{@link #IDC_ICON}</td><td>{@link #IDC_SIZENWSE}</td></tr><tr><td>{@link #IDC_SIZENESW}</td><td>{@link #IDC_SIZEWE}</td><td>{@link #IDC_SIZENS}</td><td>{@link #IDC_SIZEALL}</td><td>{@link #IDC_NO}</td><td>{@link #IDC_HAND}</td><td>{@link #IDC_APPSTARTING}</td><td>{@link #IDC_HELP}</td></tr></table>
	 */
	public static long LoadCursor(long instance, CharSequence cursorName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer cursorNameEncoded = stack.UTF16(cursorName);
			return nLoadCursor(instance, memAddress(cursorNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ GetDC ] ---

	/**
	 * Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
	 * subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
	 *
	 * @param hWnd a handle to the window whose DC is to be retrieved. If this value is {@code NULL}, GetDC retrieves the DC for the entire screen.
	 */
	public static long GetDC(long hWnd) {
		long __functionAddress = Functions.GetDC;
		return callPP(__functionAddress, hWnd);
	}

	// --- [ ReleaseDC ] ---

	/**
	 * Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
	 * common and window DCs. It has no effect on class or private DCs.
	 *
	 * @param hWnd a handle to the window whose DC is to be released
	 * @param hDC  a handle to the DC to be released
	 */
	public static boolean ReleaseDC(long hWnd, long hDC) {
		long __functionAddress = Functions.ReleaseDC;
		if ( CHECKS ) {
			checkPointer(hWnd);
			checkPointer(hDC);
		}
		return callPPI(__functionAddress, hWnd, hDC) != 0;
	}

	// --- [ GetSystemMetrics ] ---

	/**
	 * Retrieves the specified system metric or system configuration setting.
	 *
	 * @param index the system metric or configuration setting to be retrieved. One of:<br><table><tr><td>{@link #SM_CXSCREEN}</td><td>{@link #SM_CYSCREEN}</td><td>{@link #SM_CXVSCROLL}</td><td>{@link #SM_CYHSCROLL}</td><td>{@link #SM_CYCAPTION}</td><td>{@link #SM_CXBORDER}</td></tr><tr><td>{@link #SM_CYBORDER}</td><td>{@link #SM_CXDLGFRAME}</td><td>{@link #SM_CYDLGFRAME}</td><td>{@link #SM_CYVTHUMB}</td><td>{@link #SM_CXHTHUMB}</td><td>{@link #SM_CXICON}</td></tr><tr><td>{@link #SM_CYICON}</td><td>{@link #SM_CXCURSOR}</td><td>{@link #SM_CYCURSOR}</td><td>{@link #SM_CYMENU}</td><td>{@link #SM_CXFULLSCREEN}</td><td>{@link #SM_CYFULLSCREEN}</td></tr><tr><td>{@link #SM_CYKANJIWINDOW}</td><td>{@link #SM_MOUSEPRESENT}</td><td>{@link #SM_CYVSCROLL}</td><td>{@link #SM_CXHSCROLL}</td><td>{@link #SM_DEBUG}</td><td>{@link #SM_SWAPBUTTON}</td></tr><tr><td>{@link #SM_RESERVED1}</td><td>{@link #SM_RESERVED2}</td><td>{@link #SM_RESERVED3}</td><td>{@link #SM_RESERVED4}</td><td>{@link #SM_CXMIN}</td><td>{@link #SM_CYMIN}</td></tr><tr><td>{@link #SM_CXSIZE}</td><td>{@link #SM_CYSIZE}</td><td>{@link #SM_CXFRAME}</td><td>{@link #SM_CYFRAME}</td><td>{@link #SM_CXMINTRACK}</td><td>{@link #SM_CYMINTRACK}</td></tr><tr><td>{@link #SM_CXDOUBLECLK}</td><td>{@link #SM_CYDOUBLECLK}</td><td>{@link #SM_CXICONSPACING}</td><td>{@link #SM_CYICONSPACING}</td><td>{@link #SM_MENUDROPALIGNMENT}</td><td>{@link #SM_PENWINDOWS}</td></tr><tr><td>{@link #SM_DBCSENABLED}</td><td>{@link #SM_CMOUSEBUTTONS}</td><td>{@link #SM_CXFIXEDFRAME}</td><td>{@link #SM_CYFIXEDFRAME}</td><td>{@link #SM_CXSIZEFRAME}</td><td>{@link #SM_CYSIZEFRAME}</td></tr><tr><td>{@link #SM_SECURE}</td><td>{@link #SM_CXEDGE}</td><td>{@link #SM_CYEDGE}</td><td>{@link #SM_CXMINSPACING}</td><td>{@link #SM_CYMINSPACING}</td><td>{@link #SM_CXSMICON}</td></tr><tr><td>{@link #SM_CYSMICON}</td><td>{@link #SM_CYSMCAPTION}</td><td>{@link #SM_CXSMSIZE}</td><td>{@link #SM_CYSMSIZE}</td><td>{@link #SM_CXMENUSIZE}</td><td>{@link #SM_CYMENUSIZE}</td></tr><tr><td>{@link #SM_ARRANGE}</td><td>{@link #SM_CXMINIMIZED}</td><td>{@link #SM_CYMINIMIZED}</td><td>{@link #SM_CXMAXTRACK}</td><td>{@link #SM_CYMAXTRACK}</td><td>{@link #SM_CXMAXIMIZED}</td></tr><tr><td>{@link #SM_CYMAXIMIZED}</td><td>{@link #SM_NETWORK}</td><td>{@link #SM_CLEANBOOT}</td><td>{@link #SM_CXDRAG}</td><td>{@link #SM_CYDRAG}</td><td>{@link #SM_SHOWSOUNDS}</td></tr><tr><td>{@link #SM_CXMENUCHECK}</td><td>{@link #SM_CYMENUCHECK}</td><td>{@link #SM_SLOWMACHINE}</td><td>{@link #SM_MIDEASTENABLED}</td><td>{@link #SM_MOUSEWHEELPRESENT}</td><td>{@link #SM_XVIRTUALSCREEN}</td></tr><tr><td>{@link #SM_YVIRTUALSCREEN}</td><td>{@link #SM_CXVIRTUALSCREEN}</td><td>{@link #SM_CYVIRTUALSCREEN}</td><td>{@link #SM_CMONITORS}</td><td>{@link #SM_SAMEDISPLAYFORMAT}</td><td>{@link #SM_IMMENABLED}</td></tr><tr><td>{@link #SM_REMOTESESSION}</td><td>{@link #SM_SHUTTINGDOWN}</td><td>{@link #SM_REMOTECONTROL}</td><td>{@link #SM_CARETBLINKINGENABLED}</td><td>{@link #SM_CXFOCUSBORDER}</td><td>{@link #SM_CYFOCUSBORDER}</td></tr><tr><td>{@link #SM_TABLETPC}</td><td>{@link #SM_MEDIACENTER}</td><td>{@link #SM_STARTER}</td><td>{@link #SM_SERVERR2}</td><td>{@link #SM_MOUSEHORIZONTALWHEELPRESENT}</td><td>{@link #SM_CXPADDEDBORDER}</td></tr><tr><td>{@link #SM_DIGITIZER}</td><td>{@link #SM_MAXIMUMTOUCHES}</td></tr></table>
	 */
	public static int GetSystemMetrics(int index) {
		long __functionAddress = Functions.GetSystemMetrics;
		return callI(__functionAddress, index);
	}

	// --- [ RegisterTouchWindow ] ---

	/**
	 * Registers a window as being touch-capable.
	 * 
	 * <p>{@code RegisterTouchWindow} must be called on every window that will be used for touch input. This means that if you have an application that has
	 * multiple windows within it, {@code RegisterTouchWindow} must be called on every window in that application that uses touch features. Also, an
	 * application can call {@code RegisterTouchWindow} any number of times for the same window if it desires to change the modifier flags. A window can be
	 * marked as no longer requiring touch input using the {@link #UnregisterTouchWindow} function.</p>
	 *
	 * @param hWnd    the handle of the window being registered. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread does not own the specified
	 *                window.
	 * @param ulFlags a set of bit flags that specify optional modifications. This field may contain 0 or one or more of:<br><table><tr><td>{@link #TWF_FINETOUCH}</td><td>{@link #TWF_WANTPALM}</td></tr></table>
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static native int nRegisterTouchWindow(long __functionAddress, long hWnd, int ulFlags);

	/**
	 * Registers a window as being touch-capable.
	 * 
	 * <p>{@code RegisterTouchWindow} must be called on every window that will be used for touch input. This means that if you have an application that has
	 * multiple windows within it, {@code RegisterTouchWindow} must be called on every window in that application that uses touch features. Also, an
	 * application can call {@code RegisterTouchWindow} any number of times for the same window if it desires to change the modifier flags. A window can be
	 * marked as no longer requiring touch input using the {@link #UnregisterTouchWindow} function.</p>
	 *
	 * @param hWnd    the handle of the window being registered. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread does not own the specified
	 *                window.
	 * @param ulFlags a set of bit flags that specify optional modifications. This field may contain 0 or one or more of:<br><table><tr><td>{@link #TWF_FINETOUCH}</td><td>{@link #TWF_WANTPALM}</td></tr></table>
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static boolean RegisterTouchWindow(long hWnd, int ulFlags) {
		long __functionAddress = Functions.RegisterTouchWindow;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hWnd);
		}
		return nRegisterTouchWindow(__functionAddress, hWnd, ulFlags) != 0;
	}

	// --- [ UnregisterTouchWindow ] ---

	/**
	 * Registers a window as no longer being touch-capable.
	 *
	 * @param hWnd the handle of the window. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread does not own the specified window.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static native int nUnregisterTouchWindow(long __functionAddress, long hWnd);

	/**
	 * Registers a window as no longer being touch-capable.
	 *
	 * @param hWnd the handle of the window. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread does not own the specified window.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static boolean UnregisterTouchWindow(long hWnd) {
		long __functionAddress = Functions.UnregisterTouchWindow;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hWnd);
		}
		return nUnregisterTouchWindow(__functionAddress, hWnd) != 0;
	}

	// --- [ IsTouchWindow ] ---

	/**
	 * Checks whether a specified window is touch-capable and, optionally, retrieves the modifier flags set for the window's touch capability.
	 *
	 * @param hWnd     the handle of the window. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread is not on the same desktop as the specified
	 *                 window.
	 * @param pulFlags an optional address of the {@code ULONG} variable to receive the modifier flags for the specified window's touch capability.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static int nIsTouchWindow(long hWnd, long pulFlags) {
		long __functionAddress = Functions.IsTouchWindow;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hWnd);
		}
		return callPPI(__functionAddress, hWnd, pulFlags);
	}

	/**
	 * Checks whether a specified window is touch-capable and, optionally, retrieves the modifier flags set for the window's touch capability.
	 *
	 * @param hWnd     the handle of the window. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread is not on the same desktop as the specified
	 *                 window.
	 * @param pulFlags an optional address of the {@code ULONG} variable to receive the modifier flags for the specified window's touch capability.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static boolean IsTouchWindow(long hWnd, IntBuffer pulFlags) {
		return nIsTouchWindow(hWnd, memAddressSafe(pulFlags)) != 0;
	}

	// --- [ GetTouchInputInfo ] ---

	/**
	 * Retrieves detailed information about touch inputs associated with a particular touch input handle.
	 *
	 * @param hTouchInput the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
	 *                    not valid. Note that the handle is not valid after it has been used in a successful call to {@link #CloseTouchInputHandle} or after it has been passed to
	 *                    {@link #DefWindowProc}, {@link #PostMessage}, {@link #SendMessage} or one of their variants.
	 * @param cInputs     The number of structures in the {@code pInputs} array. This should ideally be at least equal to the number of touch points associated with the
	 *                    message as indicated in the message {@code WPARAM}. If {@code cInputs} is less than the number of touch points, the function will still succeed and
	 *                    populate the {@code pInputs} buffer with information about {@code cInputs} touch points.
	 * @param pInputs     a pointer to an array of {@link TOUCHINPUT} structures to receive information about the touch points associated with the specified touch input handle
	 * @param cbSize      the size, in bytes, of a single {@link TOUCHINPUT} structure. If {@code cbSize} is not the size of a single {@code TOUCHINPUT} structure, the function
	 *                    fails with {@code ERROR_INVALID_PARAMETER}.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static native int nGetTouchInputInfo(long __functionAddress, long hTouchInput, int cInputs, long pInputs, int cbSize);

	/**
	 * Retrieves detailed information about touch inputs associated with a particular touch input handle.
	 *
	 * @param hTouchInput the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
	 *                    not valid. Note that the handle is not valid after it has been used in a successful call to {@link #CloseTouchInputHandle} or after it has been passed to
	 *                    {@link #DefWindowProc}, {@link #PostMessage}, {@link #SendMessage} or one of their variants.
	 * @param cInputs     The number of structures in the {@code pInputs} array. This should ideally be at least equal to the number of touch points associated with the
	 *                    message as indicated in the message {@code WPARAM}. If {@code cInputs} is less than the number of touch points, the function will still succeed and
	 *                    populate the {@code pInputs} buffer with information about {@code cInputs} touch points.
	 * @param pInputs     a pointer to an array of {@link TOUCHINPUT} structures to receive information about the touch points associated with the specified touch input handle
	 * @param cbSize      the size, in bytes, of a single {@link TOUCHINPUT} structure. If {@code cbSize} is not the size of a single {@code TOUCHINPUT} structure, the function
	 *                    fails with {@code ERROR_INVALID_PARAMETER}.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static int nGetTouchInputInfo(long hTouchInput, int cInputs, long pInputs, int cbSize) {
		long __functionAddress = Functions.GetTouchInputInfo;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hTouchInput);
		}
		return nGetTouchInputInfo(__functionAddress, hTouchInput, cInputs, pInputs, cbSize);
	}

	/**
	 * Retrieves detailed information about touch inputs associated with a particular touch input handle.
	 *
	 * @param hTouchInput the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
	 *                    not valid. Note that the handle is not valid after it has been used in a successful call to {@link #CloseTouchInputHandle} or after it has been passed to
	 *                    {@link #DefWindowProc}, {@link #PostMessage}, {@link #SendMessage} or one of their variants.
	 * @param pInputs     a pointer to an array of {@link TOUCHINPUT} structures to receive information about the touch points associated with the specified touch input handle
	 * @param cbSize      the size, in bytes, of a single {@link TOUCHINPUT} structure. If {@code cbSize} is not the size of a single {@code TOUCHINPUT} structure, the function
	 *                    fails with {@code ERROR_INVALID_PARAMETER}.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static boolean GetTouchInputInfo(long hTouchInput, TOUCHINPUT.Buffer pInputs, int cbSize) {
		return nGetTouchInputInfo(hTouchInput, pInputs.remaining(), pInputs.address(), cbSize) != 0;
	}

	// --- [ CloseTouchInputHandle ] ---

	/**
	 * Closes a touch input handle, frees process memory associated with it, and invalidates the handle.
	 *
	 * @param hTouchInput the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
	 *                    not valid. Note that the handle is not valid after it has been used in a successful call to {@link #CloseTouchInputHandle} or after it has been passed to
	 *                    {@link #DefWindowProc}, {@link #PostMessage}, {@link #SendMessage} or one of their variants.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static native int nCloseTouchInputHandle(long __functionAddress, long hTouchInput);

	/**
	 * Closes a touch input handle, frees process memory associated with it, and invalidates the handle.
	 *
	 * @param hTouchInput the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
	 *                    not valid. Note that the handle is not valid after it has been used in a successful call to {@link #CloseTouchInputHandle} or after it has been passed to
	 *                    {@link #DefWindowProc}, {@link #PostMessage}, {@link #SendMessage} or one of their variants.
	 *
	 * @since Windows 7 (desktop apps only)
	 */
	public static boolean CloseTouchInputHandle(long hTouchInput) {
		long __functionAddress = Functions.CloseTouchInputHandle;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hTouchInput);
		}
		return nCloseTouchInputHandle(__functionAddress, hTouchInput) != 0;
	}

	// --- [ MonitorFromWindow ] ---

	/**
	 * Retrieves a handle to the display monitor that has the largest area of intersection with the bounding rectangle of a specified window.
	 *
	 * @param hWnd    a handle to the window of interest
	 * @param dwFlags determines the function's return value if the window does not intersect any display monitor. One of:<br><table><tr><td>{@link #MONITOR_DEFAULTTONULL}</td><td>{@link #MONITOR_DEFAULTTOPRIMARY}</td><td>{@link #MONITOR_DEFAULTTONEAREST}</td></tr></table>
	 */
	public static long MonitorFromWindow(long hWnd, int dwFlags) {
		long __functionAddress = Functions.MonitorFromWindow;
		if ( CHECKS )
			checkPointer(hWnd);
		return callPP(__functionAddress, hWnd, dwFlags);
	}

	// --- [ GetMonitorInfo ] ---

	/**
	 * Retrieves information about a display monitor.
	 *
	 * @param hMonitor a handle to the display monitor of interest
	 * @param lpmi     a pointer to a {@link MONITORINFOEX} structure that receives information about the specified display monitor.
	 *                 
	 *                 <p>You must set the {@code cbSize} member of the structure to {@link MONITORINFOEX#SIZEOF} before calling the {@code GetMonitorInfo} function. Doing so lets
	 *                 the function determine the type of structure you are passing to it.</p>
	 */
	public static int nGetMonitorInfo(long hMonitor, long lpmi) {
		long __functionAddress = Functions.GetMonitorInfo;
		if ( CHECKS )
			checkPointer(hMonitor);
		return callPPI(__functionAddress, hMonitor, lpmi);
	}

	/**
	 * Retrieves information about a display monitor.
	 *
	 * @param hMonitor a handle to the display monitor of interest
	 * @param lpmi     a pointer to a {@link MONITORINFOEX} structure that receives information about the specified display monitor.
	 *                 
	 *                 <p>You must set the {@code cbSize} member of the structure to {@link MONITORINFOEX#SIZEOF} before calling the {@code GetMonitorInfo} function. Doing so lets
	 *                 the function determine the type of structure you are passing to it.</p>
	 */
	public static boolean GetMonitorInfo(long hMonitor, MONITORINFOEX lpmi) {
		return nGetMonitorInfo(hMonitor, lpmi.address()) != 0;
	}

	// --- [ EnumDisplayDevices ] ---

	/**
	 * Obtains information about the display devices in the current session.
	 *
	 * @param lpDevice        the device name. If {@code NULL}, function returns information for the display adapter(s) on the machine, based on {@code devNum}.
	 * @param iDevNum         an index value that specifies the display device of interest.
	 *                        
	 *                        <p>The operating system identifies each display device in the current session with an index value. The index values are consecutive integers, starting
	 *                        at 0. If the current session has three display devices, for example, they are specified by the index values 0, 1, and 2.</p>
	 * @param lpDisplayDevice a pointer to a {@link DISPLAY_DEVICE} structure that receives information about the display device specified by {@code iDevNum}.
	 *                        
	 *                        <p>Before calling {@code EnumDisplayDevices}, you must initialize the {@code cb} member of {@code DISPLAY_DEVICE} to the size, in bytes, of
	 *                        {@code DISPLAY_DEVICE}.</p>
	 * @param dwFlags         set this flag to {@link #EDD_GET_DEVICE_INTERFACE_NAME} to retrieve the device interface name for {@code GUID_DEVINTERFACE_MONITOR}, which is registered by
	 *                        the operating system on a per monitor basis. The value is placed in the {@code DeviceID} member of the {@link DISPLAY_DEVICE} structure returned in
	 *                        {@code lpDisplayDevice}. The resulting device interface name can be used with SetupAPI functions and serves as a link between GDI monitor devices
	 *                        and SetupAPI monitor devices.
	 */
	public static int nEnumDisplayDevices(long lpDevice, int iDevNum, long lpDisplayDevice, int dwFlags) {
		long __functionAddress = Functions.EnumDisplayDevices;
		return callPPI(__functionAddress, lpDevice, iDevNum, lpDisplayDevice, dwFlags);
	}

	/**
	 * Obtains information about the display devices in the current session.
	 *
	 * @param lpDevice        the device name. If {@code NULL}, function returns information for the display adapter(s) on the machine, based on {@code devNum}.
	 * @param iDevNum         an index value that specifies the display device of interest.
	 *                        
	 *                        <p>The operating system identifies each display device in the current session with an index value. The index values are consecutive integers, starting
	 *                        at 0. If the current session has three display devices, for example, they are specified by the index values 0, 1, and 2.</p>
	 * @param lpDisplayDevice a pointer to a {@link DISPLAY_DEVICE} structure that receives information about the display device specified by {@code iDevNum}.
	 *                        
	 *                        <p>Before calling {@code EnumDisplayDevices}, you must initialize the {@code cb} member of {@code DISPLAY_DEVICE} to the size, in bytes, of
	 *                        {@code DISPLAY_DEVICE}.</p>
	 * @param dwFlags         set this flag to {@link #EDD_GET_DEVICE_INTERFACE_NAME} to retrieve the device interface name for {@code GUID_DEVINTERFACE_MONITOR}, which is registered by
	 *                        the operating system on a per monitor basis. The value is placed in the {@code DeviceID} member of the {@link DISPLAY_DEVICE} structure returned in
	 *                        {@code lpDisplayDevice}. The resulting device interface name can be used with SetupAPI functions and serves as a link between GDI monitor devices
	 *                        and SetupAPI monitor devices.
	 */
	public static boolean EnumDisplayDevices(ByteBuffer lpDevice, int iDevNum, DISPLAY_DEVICE lpDisplayDevice, int dwFlags) {
		if ( CHECKS )
			if ( lpDevice != null ) checkNT2(lpDevice);
		return nEnumDisplayDevices(memAddressSafe(lpDevice), iDevNum, lpDisplayDevice.address(), dwFlags) != 0;
	}

	/**
	 * Obtains information about the display devices in the current session.
	 *
	 * @param lpDevice        the device name. If {@code NULL}, function returns information for the display adapter(s) on the machine, based on {@code devNum}.
	 * @param iDevNum         an index value that specifies the display device of interest.
	 *                        
	 *                        <p>The operating system identifies each display device in the current session with an index value. The index values are consecutive integers, starting
	 *                        at 0. If the current session has three display devices, for example, they are specified by the index values 0, 1, and 2.</p>
	 * @param lpDisplayDevice a pointer to a {@link DISPLAY_DEVICE} structure that receives information about the display device specified by {@code iDevNum}.
	 *                        
	 *                        <p>Before calling {@code EnumDisplayDevices}, you must initialize the {@code cb} member of {@code DISPLAY_DEVICE} to the size, in bytes, of
	 *                        {@code DISPLAY_DEVICE}.</p>
	 * @param dwFlags         set this flag to {@link #EDD_GET_DEVICE_INTERFACE_NAME} to retrieve the device interface name for {@code GUID_DEVINTERFACE_MONITOR}, which is registered by
	 *                        the operating system on a per monitor basis. The value is placed in the {@code DeviceID} member of the {@link DISPLAY_DEVICE} structure returned in
	 *                        {@code lpDisplayDevice}. The resulting device interface name can be used with SetupAPI functions and serves as a link between GDI monitor devices
	 *                        and SetupAPI monitor devices.
	 */
	public static boolean EnumDisplayDevices(CharSequence lpDevice, int iDevNum, DISPLAY_DEVICE lpDisplayDevice, int dwFlags) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer lpDeviceEncoded = stack.UTF16(lpDevice);
			return nEnumDisplayDevices(memAddressSafe(lpDeviceEncoded), iDevNum, lpDisplayDevice.address(), dwFlags) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ EnumDisplaySettingsEx ] ---

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
	 * make a series of calls to this function.
	 *
	 * @param lpszDeviceName a pointer to a null-terminated string that specifies the display device about which graphics mode the function will obtain information.
	 *                       
	 *                       <p>This parameter is either {@code NULL} or a {@link DISPLAY_DEVICE#DeviceName} returned from {@link #EnumDisplayDevices}. A {@code NULL} value specifies the current display
	 *                       device on the computer that the calling thread is running on.</p>
	 * @param iModeNum       indicates the type of information to be retrieved.
	 *                       
	 *                       <p>Graphics mode indexes start at zero. To obtain information for all of a display device's graphics modes, make a series of calls to
	 *                       {@code EnumDisplaySettingsEx}, as follows: Set {@code iModeNum} to zero for the first call, and increment {@code iModeNum} by one for each
	 *                       subsequent call. Continue calling the function until the return value is zero.</p>
	 *                       
	 *                       <p>When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to zero, the operating system initializes and caches information about the
	 *                       display device. When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to a nonzero value, the function returns the information that
	 *                       was cached the last time the function was called with {@code iModeNum} set to zero.</p>
	 *                       
	 *                       <p>This value can be a graphics mode index or one of:<br></p><table><tr><td>{@link #ENUM_CURRENT_SETTINGS}</td><td>{@link #ENUM_REGISTRY_SETTINGS}</td></tr></table>
	 * @param lpDevMode      a pointer to a {@link DEVMODE} structure into which the function stores information about the specified graphics mode. Before calling
	 *                       {@code EnumDisplaySettingsEx}, set the {@code dmSize} member to {@link DEVMODE#SIZEOF}, and set the {@code dmDriverExtra} member to indicate the size, in
	 *                       bytes, of the additional space available to receive private driver data.
	 *                       
	 *                       <p>The {@code EnumDisplaySettingsEx} function will populate the {@code dmFields} member of the {@code lpDevMode} and one or more other members of the
	 *                       {@code DEVMODE} structure. To determine which members were set by the call to {@code EnumDisplaySettingsEx}, inspect the {@code dmFields} bitmask.</p>
	 * @param dwFlags        this parameter can be one of:<br><table><tr><td>{@link #EDS_RAWMODE}</td><td>{@link #EDS_ROTATEDMODE}</td></tr></table>
	 */
	public static int nEnumDisplaySettingsEx(long lpszDeviceName, int iModeNum, long lpDevMode, int dwFlags) {
		long __functionAddress = Functions.EnumDisplaySettingsEx;
		return callPPI(__functionAddress, lpszDeviceName, iModeNum, lpDevMode, dwFlags);
	}

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
	 * make a series of calls to this function.
	 *
	 * @param lpszDeviceName a pointer to a null-terminated string that specifies the display device about which graphics mode the function will obtain information.
	 *                       
	 *                       <p>This parameter is either {@code NULL} or a {@link DISPLAY_DEVICE#DeviceName} returned from {@link #EnumDisplayDevices}. A {@code NULL} value specifies the current display
	 *                       device on the computer that the calling thread is running on.</p>
	 * @param iModeNum       indicates the type of information to be retrieved.
	 *                       
	 *                       <p>Graphics mode indexes start at zero. To obtain information for all of a display device's graphics modes, make a series of calls to
	 *                       {@code EnumDisplaySettingsEx}, as follows: Set {@code iModeNum} to zero for the first call, and increment {@code iModeNum} by one for each
	 *                       subsequent call. Continue calling the function until the return value is zero.</p>
	 *                       
	 *                       <p>When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to zero, the operating system initializes and caches information about the
	 *                       display device. When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to a nonzero value, the function returns the information that
	 *                       was cached the last time the function was called with {@code iModeNum} set to zero.</p>
	 *                       
	 *                       <p>This value can be a graphics mode index or one of:<br></p><table><tr><td>{@link #ENUM_CURRENT_SETTINGS}</td><td>{@link #ENUM_REGISTRY_SETTINGS}</td></tr></table>
	 * @param lpDevMode      a pointer to a {@link DEVMODE} structure into which the function stores information about the specified graphics mode. Before calling
	 *                       {@code EnumDisplaySettingsEx}, set the {@code dmSize} member to {@link DEVMODE#SIZEOF}, and set the {@code dmDriverExtra} member to indicate the size, in
	 *                       bytes, of the additional space available to receive private driver data.
	 *                       
	 *                       <p>The {@code EnumDisplaySettingsEx} function will populate the {@code dmFields} member of the {@code lpDevMode} and one or more other members of the
	 *                       {@code DEVMODE} structure. To determine which members were set by the call to {@code EnumDisplaySettingsEx}, inspect the {@code dmFields} bitmask.</p>
	 * @param dwFlags        this parameter can be one of:<br><table><tr><td>{@link #EDS_RAWMODE}</td><td>{@link #EDS_ROTATEDMODE}</td></tr></table>
	 */
	public static boolean EnumDisplaySettingsEx(ByteBuffer lpszDeviceName, int iModeNum, DEVMODE lpDevMode, int dwFlags) {
		if ( CHECKS )
			if ( lpszDeviceName != null ) checkNT2(lpszDeviceName);
		return nEnumDisplaySettingsEx(memAddressSafe(lpszDeviceName), iModeNum, lpDevMode.address(), dwFlags) != 0;
	}

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
	 * make a series of calls to this function.
	 *
	 * @param lpszDeviceName a pointer to a null-terminated string that specifies the display device about which graphics mode the function will obtain information.
	 *                       
	 *                       <p>This parameter is either {@code NULL} or a {@link DISPLAY_DEVICE#DeviceName} returned from {@link #EnumDisplayDevices}. A {@code NULL} value specifies the current display
	 *                       device on the computer that the calling thread is running on.</p>
	 * @param iModeNum       indicates the type of information to be retrieved.
	 *                       
	 *                       <p>Graphics mode indexes start at zero. To obtain information for all of a display device's graphics modes, make a series of calls to
	 *                       {@code EnumDisplaySettingsEx}, as follows: Set {@code iModeNum} to zero for the first call, and increment {@code iModeNum} by one for each
	 *                       subsequent call. Continue calling the function until the return value is zero.</p>
	 *                       
	 *                       <p>When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to zero, the operating system initializes and caches information about the
	 *                       display device. When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to a nonzero value, the function returns the information that
	 *                       was cached the last time the function was called with {@code iModeNum} set to zero.</p>
	 *                       
	 *                       <p>This value can be a graphics mode index or one of:<br></p><table><tr><td>{@link #ENUM_CURRENT_SETTINGS}</td><td>{@link #ENUM_REGISTRY_SETTINGS}</td></tr></table>
	 * @param lpDevMode      a pointer to a {@link DEVMODE} structure into which the function stores information about the specified graphics mode. Before calling
	 *                       {@code EnumDisplaySettingsEx}, set the {@code dmSize} member to {@link DEVMODE#SIZEOF}, and set the {@code dmDriverExtra} member to indicate the size, in
	 *                       bytes, of the additional space available to receive private driver data.
	 *                       
	 *                       <p>The {@code EnumDisplaySettingsEx} function will populate the {@code dmFields} member of the {@code lpDevMode} and one or more other members of the
	 *                       {@code DEVMODE} structure. To determine which members were set by the call to {@code EnumDisplaySettingsEx}, inspect the {@code dmFields} bitmask.</p>
	 * @param dwFlags        this parameter can be one of:<br><table><tr><td>{@link #EDS_RAWMODE}</td><td>{@link #EDS_ROTATEDMODE}</td></tr></table>
	 */
	public static boolean EnumDisplaySettingsEx(CharSequence lpszDeviceName, int iModeNum, DEVMODE lpDevMode, int dwFlags) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer lpszDeviceNameEncoded = stack.UTF16(lpszDeviceName);
			return nEnumDisplaySettingsEx(memAddressSafe(lpszDeviceNameEncoded), iModeNum, lpDevMode.address(), dwFlags) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ChangeDisplaySettingsEx ] ---

	/**
	 * Changes the settings of the specified display device to the specified graphics mode.
	 *
	 * @param lpszDeviceName a pointer to a null-terminated string that specifies the display device whose graphics mode will change. Only display device names as returned by
	 *                       {@link #EnumDisplayDevices} are valid.
	 *                       
	 *                       <p>The {@code lpszDeviceName} parameter can be {@code NULL}. A {@code NULL} value specifies the default display device. The default device can be determined by
	 *                       calling {@code EnumDisplayDevices} and checking for the {@link GDI32#DISPLAY_DEVICE_PRIMARY_DEVICE} flag.</p>
	 * @param lpDevMode      a pointer to a {@link DEVMODE} structure that describes the new graphics mode. If {@code lpDevMode} is {@code NULL}, all the values currently in the registry
	 *                       will be used for the display setting. Passing {@code NULL} for the {@code lpDevMode} parameter and 0 for the {@code dwFlags} parameter is the easiest way
	 *                       to return to the default mode after a dynamic mode change.
	 *                       
	 *                       <p>The {@code dmSize} member must be initialized to the size, in bytes, of the {@code DEVMODE} structure. The {@code dmDriverExtra} member must be
	 *                       initialized to indicate the number of bytes of private driver data following the {@code DEVMODE} structure.</p>
	 * @param hwnd           reserved; must be {@code NULL}
	 * @param dwflags        indicates how the graphics mode should be changed. One of:<br><table><tr><td>{@link #CDS_UPDATEREGISTRY}</td><td>{@link #CDS_TEST}</td><td>{@link #CDS_FULLSCREEN}</td><td>{@link #CDS_GLOBAL}</td><td>{@link #CDS_SET_PRIMARY}</td></tr><tr><td>{@link #CDS_VIDEOPARAMETERS}</td><td>{@link #CDS_ENABLE_UNSAFE_MODES}</td><td>{@link #CDS_DISABLE_UNSAFE_MODES}</td><td>{@link #CDS_RESET}</td><td>{@link #CDS_RESET_EX}</td></tr><tr><td>{@link #CDS_NORESET}</td></tr></table>
	 * @param lParam         if {@code flags} is {@link #CDS_VIDEOPARAMETERS}, {@code lParam} is a pointer to a {@code VIDEOPARAMETERS} structure. Otherwise {@code lParam} must be {@code NULL}.
	 *
	 * @return one of the following values: {@link #DISP_CHANGE_SUCCESSFUL} {@link #DISP_CHANGE_RESTART} {@link #DISP_CHANGE_FAILED} {@link #DISP_CHANGE_BADMODE} {@link #DISP_CHANGE_NOTUPDATED} {@link #DISP_CHANGE_BADFLAGS} {@link #DISP_CHANGE_BADPARAM} {@link #DISP_CHANGE_BADDUALVIEW}
	 */
	public static int nChangeDisplaySettingsEx(long lpszDeviceName, long lpDevMode, long hwnd, int dwflags, long lParam) {
		long __functionAddress = Functions.ChangeDisplaySettingsEx;
		return callPPPPI(__functionAddress, lpszDeviceName, lpDevMode, hwnd, dwflags, lParam);
	}

	/**
	 * Changes the settings of the specified display device to the specified graphics mode.
	 *
	 * @param lpszDeviceName a pointer to a null-terminated string that specifies the display device whose graphics mode will change. Only display device names as returned by
	 *                       {@link #EnumDisplayDevices} are valid.
	 *                       
	 *                       <p>The {@code lpszDeviceName} parameter can be {@code NULL}. A {@code NULL} value specifies the default display device. The default device can be determined by
	 *                       calling {@code EnumDisplayDevices} and checking for the {@link GDI32#DISPLAY_DEVICE_PRIMARY_DEVICE} flag.</p>
	 * @param lpDevMode      a pointer to a {@link DEVMODE} structure that describes the new graphics mode. If {@code lpDevMode} is {@code NULL}, all the values currently in the registry
	 *                       will be used for the display setting. Passing {@code NULL} for the {@code lpDevMode} parameter and 0 for the {@code dwFlags} parameter is the easiest way
	 *                       to return to the default mode after a dynamic mode change.
	 *                       
	 *                       <p>The {@code dmSize} member must be initialized to the size, in bytes, of the {@code DEVMODE} structure. The {@code dmDriverExtra} member must be
	 *                       initialized to indicate the number of bytes of private driver data following the {@code DEVMODE} structure.</p>
	 * @param hwnd           reserved; must be {@code NULL}
	 * @param dwflags        indicates how the graphics mode should be changed. One of:<br><table><tr><td>{@link #CDS_UPDATEREGISTRY}</td><td>{@link #CDS_TEST}</td><td>{@link #CDS_FULLSCREEN}</td><td>{@link #CDS_GLOBAL}</td><td>{@link #CDS_SET_PRIMARY}</td></tr><tr><td>{@link #CDS_VIDEOPARAMETERS}</td><td>{@link #CDS_ENABLE_UNSAFE_MODES}</td><td>{@link #CDS_DISABLE_UNSAFE_MODES}</td><td>{@link #CDS_RESET}</td><td>{@link #CDS_RESET_EX}</td></tr><tr><td>{@link #CDS_NORESET}</td></tr></table>
	 * @param lParam         if {@code flags} is {@link #CDS_VIDEOPARAMETERS}, {@code lParam} is a pointer to a {@code VIDEOPARAMETERS} structure. Otherwise {@code lParam} must be {@code NULL}.
	 *
	 * @return one of the following values: {@link #DISP_CHANGE_SUCCESSFUL} {@link #DISP_CHANGE_RESTART} {@link #DISP_CHANGE_FAILED} {@link #DISP_CHANGE_BADMODE} {@link #DISP_CHANGE_NOTUPDATED} {@link #DISP_CHANGE_BADFLAGS} {@link #DISP_CHANGE_BADPARAM} {@link #DISP_CHANGE_BADDUALVIEW}
	 */
	public static int ChangeDisplaySettingsEx(ByteBuffer lpszDeviceName, DEVMODE lpDevMode, long hwnd, int dwflags, long lParam) {
		if ( CHECKS )
			if ( lpszDeviceName != null ) checkNT2(lpszDeviceName);
		return nChangeDisplaySettingsEx(memAddressSafe(lpszDeviceName), lpDevMode == null ? NULL : lpDevMode.address(), hwnd, dwflags, lParam);
	}

	/**
	 * Changes the settings of the specified display device to the specified graphics mode.
	 *
	 * @param lpszDeviceName a pointer to a null-terminated string that specifies the display device whose graphics mode will change. Only display device names as returned by
	 *                       {@link #EnumDisplayDevices} are valid.
	 *                       
	 *                       <p>The {@code lpszDeviceName} parameter can be {@code NULL}. A {@code NULL} value specifies the default display device. The default device can be determined by
	 *                       calling {@code EnumDisplayDevices} and checking for the {@link GDI32#DISPLAY_DEVICE_PRIMARY_DEVICE} flag.</p>
	 * @param lpDevMode      a pointer to a {@link DEVMODE} structure that describes the new graphics mode. If {@code lpDevMode} is {@code NULL}, all the values currently in the registry
	 *                       will be used for the display setting. Passing {@code NULL} for the {@code lpDevMode} parameter and 0 for the {@code dwFlags} parameter is the easiest way
	 *                       to return to the default mode after a dynamic mode change.
	 *                       
	 *                       <p>The {@code dmSize} member must be initialized to the size, in bytes, of the {@code DEVMODE} structure. The {@code dmDriverExtra} member must be
	 *                       initialized to indicate the number of bytes of private driver data following the {@code DEVMODE} structure.</p>
	 * @param hwnd           reserved; must be {@code NULL}
	 * @param dwflags        indicates how the graphics mode should be changed. One of:<br><table><tr><td>{@link #CDS_UPDATEREGISTRY}</td><td>{@link #CDS_TEST}</td><td>{@link #CDS_FULLSCREEN}</td><td>{@link #CDS_GLOBAL}</td><td>{@link #CDS_SET_PRIMARY}</td></tr><tr><td>{@link #CDS_VIDEOPARAMETERS}</td><td>{@link #CDS_ENABLE_UNSAFE_MODES}</td><td>{@link #CDS_DISABLE_UNSAFE_MODES}</td><td>{@link #CDS_RESET}</td><td>{@link #CDS_RESET_EX}</td></tr><tr><td>{@link #CDS_NORESET}</td></tr></table>
	 * @param lParam         if {@code flags} is {@link #CDS_VIDEOPARAMETERS}, {@code lParam} is a pointer to a {@code VIDEOPARAMETERS} structure. Otherwise {@code lParam} must be {@code NULL}.
	 *
	 * @return one of the following values: {@link #DISP_CHANGE_SUCCESSFUL} {@link #DISP_CHANGE_RESTART} {@link #DISP_CHANGE_FAILED} {@link #DISP_CHANGE_BADMODE} {@link #DISP_CHANGE_NOTUPDATED} {@link #DISP_CHANGE_BADFLAGS} {@link #DISP_CHANGE_BADPARAM} {@link #DISP_CHANGE_BADDUALVIEW}
	 */
	public static int ChangeDisplaySettingsEx(CharSequence lpszDeviceName, DEVMODE lpDevMode, long hwnd, int dwflags, long lParam) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer lpszDeviceNameEncoded = stack.UTF16(lpszDeviceName);
			return nChangeDisplaySettingsEx(memAddressSafe(lpszDeviceNameEncoded), lpDevMode == null ? NULL : lpDevMode.address(), hwnd, dwflags, lParam);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ GetCursorPos ] ---

	/**
	 * Retrieves the position of the mouse cursor, in screen coordinates.
	 *
	 * @param point a pointer to a {@link POINT} structure that receives the screen coordinates of the cursor
	 */
	public static int nGetCursorPos(long point) {
		long __functionAddress = Functions.GetCursorPos;
		return callPI(__functionAddress, point);
	}

	/**
	 * Retrieves the position of the mouse cursor, in screen coordinates.
	 *
	 * @param point a pointer to a {@link POINT} structure that receives the screen coordinates of the cursor
	 */
	public static boolean GetCursorPos(POINT point) {
		return nGetCursorPos(point.address()) != 0;
	}

	// --- [ SetCursorPos ] ---

	/**
	 * Moves the cursor to the specified screen coordinates. If the new coordinates are not within the screen rectangle set by the most recent {@link #ClipCursor}
	 * function call, the system automatically adjusts the coordinates so that the cursor stays within the rectangle.
	 *
	 * @param X the new x-coordinate of the cursor, in screen coordinates.
	 * @param Y the new y-coordinate of the cursor, in screen coordinates.
	 */
	public static boolean SetCursorPos(int X, int Y) {
		long __functionAddress = Functions.SetCursorPos;
		return callI(__functionAddress, X, Y) != 0;
	}

	// --- [ ClipCursor ] ---

	/**
	 * Confines the cursor to a rectangular area on the screen. If a subsequent cursor position (set by the {@link #SetCursorPos} function or the mouse) lies
	 * outside the rectangle, the system automatically adjusts the position to keep the cursor inside the rectangular area.
	 *
	 * @param rect a pointer to the structure that contains the screen coordinates of the upper-left and lower-right corners of the confining rectangle. If this
	 *             parameter is {@code NULL}, the cursor is free to move anywhere on the screen.
	 */
	public static int nClipCursor(long rect) {
		long __functionAddress = Functions.ClipCursor;
		return callPI(__functionAddress, rect);
	}

	/**
	 * Confines the cursor to a rectangular area on the screen. If a subsequent cursor position (set by the {@link #SetCursorPos} function or the mouse) lies
	 * outside the rectangle, the system automatically adjusts the position to keep the cursor inside the rectangular area.
	 *
	 * @param rect a pointer to the structure that contains the screen coordinates of the upper-left and lower-right corners of the confining rectangle. If this
	 *             parameter is {@code NULL}, the cursor is free to move anywhere on the screen.
	 */
	public static boolean ClipCursor(RECT rect) {
		return nClipCursor(rect == null ? NULL : rect.address()) != 0;
	}

	// --- [ ShowCursor ] ---

	/**
	 * Displays or hides the cursor.
	 * 
	 * <p>This function sets an internal display counter that determines whether the cursor should be displayed. The cursor is displayed only if the display
	 * count is greater than or equal to 0. If a mouse is installed, the initial display count is 0. If no mouse is installed, the display count is –1.</p>
	 *
	 * @param show If {@code show} is {@link WinBase#TRUE}, the display count is incremented by one. If {@code show} is {@link WinBase#FALSE}, the display count is decremented by one.
	 *
	 * @return the new display counter
	 */
	public static int ShowCursor(boolean show) {
		long __functionAddress = Functions.ShowCursor;
		return callI(__functionAddress, show ? 1 : 0);
	}

	// --- [ SetCursor ] ---

	/**
	 * Sets the cursor shape.
	 * 
	 * <p>The cursor is set only if the new cursor is different from the previous cursor; otherwise, the function returns immediately.</p>
	 * 
	 * <p>The cursor is a shared resource. A window should set the cursor shape only when the cursor is in its client area or when the window is capturing mouse
	 * input. In systems without a mouse, the window should restore the previous cursor before the cursor leaves the client area or before it relinquishes
	 * control to another window.</p>
	 * 
	 * <p>If your application must set the cursor while it is in a window, make sure the class cursor for the specified window's class is set to {@code NULL}. If the
	 * class cursor is not {@code NULL}, the system restores the class cursor each time the mouse is moved.</p>
	 * 
	 * <p>The cursor is not shown on the screen if the internal cursor display count is less than zero. This occurs if the application uses the {@link #ShowCursor}
	 * function to hide the cursor more times than to show the cursor.</p>
	 *
	 * @param hCursor a handle to the cursor. The cursor must have been created by the {@link #CreateCursor} function or loaded by the {@link #LoadCursor} or {@link #LoadImage} function.
	 *                If this parameter is {@code NULL}, the cursor is removed from the screen.
	 *
	 * @return the handle to the previous cursor, if there was one
	 */
	public static long SetCursor(long hCursor) {
		long __functionAddress = Functions.SetCursor;
		return callPP(__functionAddress, hCursor);
	}

	/** Array version of: {@link #IsTouchWindow} */
	public static boolean IsTouchWindow(long hWnd, int[] pulFlags) {
		long __functionAddress = Functions.IsTouchWindow;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hWnd);
		}
		return callPPI(__functionAddress, hWnd, pulFlags) != 0;
	}

}