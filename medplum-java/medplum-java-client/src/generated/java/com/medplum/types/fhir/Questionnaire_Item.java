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
  Optional<List<Extension>> modifierExtension();

  Optional<String> prefix();

  Optional<Boolean> repeats();

  Optional<List<Questionnaire_EnableWhen>> enableWhen();

  Optional<Integer> maxLength();

  Optional<Questionnaire_itemEnablebehavior> enableBehavior();

  Optional<String> id();

  Optional<String> linkId();

  Optional<Boolean> readOnly();

  Optional<List<Questionnaire_Item>> item();

  Optional<Questionnaire_itemType> type();

  Optional<Uri> definition();

  Optional<String> text();

  Optional<List<Questionnaire_AnswerOption>> answerOption();

  Optional<Boolean> required();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> code();

  Optional<List<Questionnaire_Initial>> initial();

  Optional<Canonical> answerValueSet();

  static ImmutableQuestionnaire_Item.Builder builder() {
    return ImmutableQuestionnaire_Item.builder();
  }
}
