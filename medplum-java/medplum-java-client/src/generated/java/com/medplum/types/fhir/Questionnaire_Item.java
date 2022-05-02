package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaire_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_Item {
  Optional<Canonical> answerValueSet();

  Optional<List<Questionnaire_AnswerOption>> answerOption();

  Optional<List<Extension>> extension();

  Optional<Boolean> repeats();

  Optional<String> prefix();

  Optional<List<Questionnaire_Item>> item();

  Optional<String> text();

  Optional<Boolean> readOnly();

  Optional<Uri> definition();

  Optional<Questionnaire_itemEnablebehavior> enableBehavior();

  Optional<Questionnaire_itemType> type();

  Optional<Integer> maxLength();

  Optional<List<Questionnaire_Initial>> initial();

  Optional<List<Coding>> code();

  Optional<String> id();

  Optional<String> linkId();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> required();

  Optional<List<Questionnaire_EnableWhen>> enableWhen();

  static ImmutableQuestionnaire_Item.Builder builder() {
    return ImmutableQuestionnaire_Item.builder();
  }
}
