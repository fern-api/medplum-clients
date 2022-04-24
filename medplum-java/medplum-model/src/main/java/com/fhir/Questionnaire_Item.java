package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Boolean> repeats();

  Optional<List<Coding>> code();

  Optional<Boolean> required();

  Optional<List<Extension>> extension();

  Optional<Questionnaire_itemEnablebehavior> enableBehavior();

  Optional<List<Questionnaire_Item>> item();

  Optional<Integer> maxLength();

  Optional<Boolean> readOnly();

  Optional<List<Extension>> modifierExtension();

  Optional<String> linkId();

  Optional<uri> definition();

  Optional<Questionnaire_itemType> type();

  Optional<String> text();

  Optional<List<Questionnaire_AnswerOption>> answerOption();

  Optional<String> prefix();

  Optional<List<Questionnaire_EnableWhen>> enableWhen();

  Optional<List<Questionnaire_Initial>> initial();

  Optional<String> id();

  Optional<canonical> answerValueSet();

  static ImmutableQuestionnaire_Item.Builder builder() {
    return ImmutableQuestionnaire_Item.builder();
  }
}
