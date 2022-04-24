package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaire.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire {
  Optional<List<ResourceList>> contained();

  Optional<markdown> purpose();

  Optional<uri> implicitRules();

  Optional<dateTime> date();

  Optional<String> version();

  Optional<List<Coding>> code();

  String resourceType();

  Optional<List<canonical>> derivedFrom();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<id> id();

  Optional<List<ContactDetail>> contact();

  Optional<uri> url();

  Optional<List<Extension>> extension();

  Optional<markdown> copyright();

  Optional<date> approvalDate();

  Optional<String> publisher();

  Optional<List<code>> subjectType();

  Optional<List<UsageContext>> useContext();

  Optional<Narrative> text();

  Optional<QuestionnaireStatus> status();

  Optional<String> name();

  Optional<code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> description();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<List<Questionnaire_Item>> item();

  Optional<date> lastReviewDate();

  Optional<Boolean> experimental();

  Optional<Period> effectivePeriod();

  Optional<String> title();

  static ImmutableQuestionnaire.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaire.builder();
  }
}
