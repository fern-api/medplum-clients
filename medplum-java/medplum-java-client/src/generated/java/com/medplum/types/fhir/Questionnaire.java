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
  Optional<String> publisher();

  Optional<List<Canonical>> derivedFrom();

  Optional<String> title();

  Optional<Narrative> text();

  Optional<Boolean> experimental();

  Optional<List<Coding>> code();

  Optional<Uri> implicitRules();

  Optional<Date> approvalDate();

  Optional<Meta> meta();

  Optional<List<ContactDetail>> contact();

  Optional<List<Questionnaire_Item>> item();

  Optional<Period> effectivePeriod();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Markdown> purpose();

  Optional<List<ResourceList>> contained();

  Optional<List<UsageContext>> useContext();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<Markdown> copyright();

  Optional<QuestionnaireStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<Date> lastReviewDate();

  Optional<List<Code>> subjectType();

  Optional<String> version();

  Optional<Uri> url();

  String resourceType();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  static ImmutableQuestionnaire.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaire.builder();
  }
}
