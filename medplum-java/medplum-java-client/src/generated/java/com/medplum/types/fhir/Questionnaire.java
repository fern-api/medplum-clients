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
  Optional<Period> effectivePeriod();

  Optional<Id> id();

  Optional<List<Coding>> code();

  Optional<Meta> meta();

  Optional<List<ContactDetail>> contact();

  Optional<String> name();

  Optional<Markdown> copyright();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Optional<List<Code>> subjectType();

  Optional<String> version();

  Optional<Date> lastReviewDate();

  Optional<List<Questionnaire_Item>> item();

  Optional<Date> approvalDate();

  Optional<Uri> url();

  Optional<QuestionnaireStatus> status();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> derivedFrom();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<String> publisher();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Identifier>> identifier();

  Optional<String> title();

  Optional<Markdown> purpose();

  static ImmutableQuestionnaire.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaire.builder();
  }
}
