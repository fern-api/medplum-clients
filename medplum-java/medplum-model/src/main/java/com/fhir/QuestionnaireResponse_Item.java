package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaireResponse_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse_Item {
  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<uri> definition();

  Optional<List<QuestionnaireResponse_Answer>> answer();

  Optional<String> linkId();

  Optional<String> text();

  static ImmutableQuestionnaireResponse_Item.Builder builder() {
    return ImmutableQuestionnaireResponse_Item.builder();
  }
}
