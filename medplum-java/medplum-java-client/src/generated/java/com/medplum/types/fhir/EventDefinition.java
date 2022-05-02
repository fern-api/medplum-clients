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
    as = ImmutableEventDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EventDefinition {
  Optional<String> title();

  Optional<Uri> url();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> topic();

  Optional<Date> lastReviewDate();

  List<TriggerDefinition> trigger();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Code> language();

  Optional<String> publisher();

  Optional<Uri> implicitRules();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<Markdown> copyright();

  Optional<EventdefinitionStatus> status();

  Optional<Reference> subjectReference();

  Optional<Markdown> purpose();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> author();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> version();

  Optional<List<ContactDetail>> editor();

  Optional<String> name();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<Markdown> description();

  Optional<Boolean> experimental();

  Optional<Period> effectivePeriod();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<String> usage();

  Optional<List<ContactDetail>> endorser();

  Optional<String> subtitle();

  static ImmutableEventDefinition.ResourceTypeBuildStage builder() {
    return ImmutableEventDefinition.builder();
  }
}
