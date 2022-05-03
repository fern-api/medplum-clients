package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> derivedFrom();

  Optional<Date> lastReviewDate();

  String resourceType();

  Optional<QuestionnaireStatus> status();

  Optional<List<ContactDetail>> contact();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Uri> url();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Date> approvalDate();

  Optional<List<Questionnaire_Item>> item();

  Optional<Narrative> text();

  Optional<List<Coding>> code();

  Optional<Boolean> experimental();

  Optional<Uri> implicitRules();

  Optional<Markdown> copyright();

  Optional<String> version();

  Optional<Period> effectivePeriod();

  Optional<String> title();

  Optional<String> publisher();

  Optional<Markdown> description();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<String> name();

  Optional<DateTime> date();

  Optional<List<Code>> subjectType();

  static ImmutableQuestionnaire.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaire.builder();
  }
}
