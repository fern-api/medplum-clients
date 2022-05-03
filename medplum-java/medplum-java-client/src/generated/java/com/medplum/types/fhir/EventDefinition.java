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
  Optional<DateTime> date();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Markdown> description();

  Optional<String> name();

  Optional<Reference> subjectReference();

  Optional<Date> approvalDate();

  Optional<String> title();

  Optional<Period> effectivePeriod();

  Optional<List<ResourceList>> contained();

  Optional<Uri> url();

  Optional<String> version();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> copyright();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> purpose();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> endorser();

  Optional<Id> id();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<Meta> meta();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Date> lastReviewDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<ContactDetail>> author();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> editor();

  Optional<String> subtitle();

  Optional<Code> language();

  List<TriggerDefinition> trigger();

  String resourceType();

  Optional<String> usage();

  Optional<EventdefinitionStatus> status();

  Optional<Boolean> experimental();

  static ImmutableEventDefinition.ResourceTypeBuildStage builder() {
    return ImmutableEventDefinition.builder();
  }
}
