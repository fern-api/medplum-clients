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
  Optional<String> prefix();

  Optional<List<Coding>> code();

  Optional<Questionnaire_itemEnablebehavior> enableBehavior();

  Optional<List<Questionnaire_EnableWhen>> enableWhen();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> readOnly();

  Optional<List<Questionnaire_AnswerOption>> answerOption();

  Optional<Canonical> answerValueSet();

  Optional<Questionnaire_itemType> type();

  Optional<Boolean> required();

  Optional<String> text();

  Optional<List<Questionnaire_Item>> item();

  Optional<List<Extension>> extension();

  Optional<Boolean> repeats();

  Optional<String> id();

  Optional<String> linkId();

  Optional<Integer> maxLength();

  Optional<Uri> definition();

  Optional<List<Questionnaire_Initial>> initial();

  static ImmutableQuestionnaire_Item.Builder builder() {
    return ImmutableQuestionnaire_Item.builder();
  }
}
