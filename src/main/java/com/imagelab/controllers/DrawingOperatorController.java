package com.imagelab.controllers;

import com.imagelab.component.OperatorUIElement;
import com.imagelab.operator.drawing.DrawCircle;
import com.imagelab.operator.drawing.DrawLine;
import com.imagelab.operator.drawing.DrawRectangle;
import com.imagelab.view.AbstractInformationUI;
import com.imagelab.view.InformationContainerView;
import com.imagelab.view.forms.AbstractPropertiesForm;
import com.imagelab.view.forms.DrawCirclePropertiesForm;
import com.imagelab.view.forms.DrawLinePropertiesForm;
import com.imagelab.view.forms.DrawRectanglePropertiesForm;

public class DrawingOperatorController {
	public static OperatorUIElement drawCircleEffectElement() {
		//drawCircle UI element.
        OperatorUIElement drawCircleEffect = new OperatorUIElement() {
            @Override
            public AbstractInformationUI buildInformationUI() {
                return new InformationContainerView(DrawCircle
                        .Information.OPERATOR_INFO.toString());
            }

            @Override
            public AbstractPropertiesForm buildPropertiesFormUI() {
                return new DrawCirclePropertiesForm((DrawCircle) this.operator);
            }
        };
        drawCircleEffect.operator = new DrawCircle();
        drawCircleEffect.operatorId = DrawCircle.class.getCanonicalName();
        drawCircleEffect.operatorName = "DRAW-CIRCLE";
        drawCircleEffect.elementStyleId = "drawCircle";
        drawCircleEffect.buildElement();
        return drawCircleEffect;
	}
	public static OperatorUIElement drawLineEffectElement() {
		//drawCircle UI element.
        OperatorUIElement drawLineEffect = new OperatorUIElement() {
            @Override
            public AbstractInformationUI buildInformationUI() {
                return new InformationContainerView(DrawLine
                        .Information.OPERATOR_INFO.toString());
            }

            @Override
            public AbstractPropertiesForm buildPropertiesFormUI() {
                return new DrawLinePropertiesForm((DrawLine) this.operator);
            }
        };
        drawLineEffect.operator = new DrawLine();
        drawLineEffect.operatorId = DrawLine.class.getCanonicalName();
        drawLineEffect.operatorName = "DRAW-LINE";
        drawLineEffect.elementStyleId = "drawLine";
        drawLineEffect.buildElement();
        return drawLineEffect;
	}
	public static OperatorUIElement drawRectangleEffectElement() {
		//drawCircle UI element.
        OperatorUIElement drawRectangleEffect = new OperatorUIElement() {
            @Override
            public AbstractInformationUI buildInformationUI() {
                return new InformationContainerView(DrawRectangle
                        .Information.OPERATOR_INFO.toString());
            }

            @Override
            public AbstractPropertiesForm buildPropertiesFormUI() {
                return new DrawRectanglePropertiesForm((DrawRectangle) this.operator);
            }
        };
        drawRectangleEffect.operator = new DrawRectangle();
        drawRectangleEffect.operatorId = DrawRectangle.class.getCanonicalName();
        drawRectangleEffect.operatorName = "DRAW-RECTANGLE";
        drawRectangleEffect.elementStyleId = "drawRectangle";
        drawRectangleEffect.buildElement();
        return drawRectangleEffect;
	}
}