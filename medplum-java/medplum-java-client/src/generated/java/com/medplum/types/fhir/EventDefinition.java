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
  Optional<List<ContactDetail>> endorser();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> author();

  Optional<Date> approvalDate();

  Optional<Date> lastReviewDate();

  Optional<DateTime> date();

  List<TriggerDefinition> trigger();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> reviewer();

  Optional<Code> language();

  Optional<Uri> url();

  Optional<List<ResourceList>> contained();

  Optional<String> usage();

  Optional<Narrative> text();

  Optional<EventdefinitionStatus> status();

  Optional<String> version();

  Optional<Period> effectivePeriod();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> editor();

  Optional<Markdown> description();

  Optional<List<UsageContext>> useContext();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> name();

  Optional<String> subtitle();

  Optional<String> publisher();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> title();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Reference> subjectReference();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> copyright();

  Optional<Markdown> purpose();

  static ImmutableEventDefinition.ResourceTypeBuildStage builder() {
    return ImmutableEventDefinition.builder();
  }
}
