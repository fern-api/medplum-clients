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
  Optional<String> linkId();

  Optional<Uri> definition();

  Optional<String> text();

  Optional<Questionnaire_itemEnablebehavior> enableBehavior();

  Optional<List<Extension>> extension();

  Optional<Integer> maxLength();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Questionnaire_Initial>> initial();

  Optional<Boolean> repeats();

  Optional<String> id();

  Optional<Boolean> readOnly();

  Optional<List<Coding>> code();

  Optional<Boolean> required();

  Optional<String> prefix();

  Optional<List<Questionnaire_AnswerOption>> answerOption();

  Optional<List<Questionnaire_Item>> item();

  Optional<Canonical> answerValueSet();

  Optional<Questionnaire_itemType> type();

  Optional<List<Questionnaire_EnableWhen>> enableWhen();

  static ImmutableQuestionnaire_Item.Builder builder() {
    return ImmutableQuestionnaire_Item.builder();
  }
}
