package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaireResponse_Answer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse_Answer {
  Optional<Double> valueDecimal();

  Optional<Attachment> valueAttachment();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<String> valueDateTime();

  Optional<String> valueUri();

  Optional<Reference> valueReference();

  Optional<String> id();

  Optional<String> valueString();

  Optional<String> valueDate();

  Optional<Coding> valueCoding();

  Optional<Boolean> valueBoolean();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> extension();

  Optional<Double> valueInteger();

  Optional<String> valueTime();

  Optional<List<Extension>> modifierExtension();

  static ImmutableQuestionnaireResponse_Answer.Builder builder() {
    return ImmutableQuestionnaireResponse_Answer.builder();
  }
}
