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
  Optional<Markdown> copyright();

  Optional<Boolean> experimental();

  Optional<String> version();

  Optional<Id> id();

  Optional<String> name();

  Optional<Date> lastReviewDate();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<Questionnaire_Item>> item();

  Optional<List<Extension>> extension();

  Optional<Uri> url();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  Optional<String> title();

  Optional<Date> approvalDate();

  Optional<List<Coding>> code();

  String resourceType();

  Optional<List<Canonical>> derivedFrom();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<QuestionnaireStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Code>> subjectType();

  Optional<Markdown> description();

  Optional<Period> effectivePeriod();

  Optional<String> publisher();

  Optional<Markdown> purpose();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> jurisdiction();

  static ImmutableQuestionnaire.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaire.builder();
  }
}
