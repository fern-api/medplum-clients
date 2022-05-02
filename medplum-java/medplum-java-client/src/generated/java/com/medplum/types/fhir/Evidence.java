package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableEvidence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Evidence {
  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> editor();

  Optional<List<CodeableConcept>> topic();

  String resourceType();

  Optional<String> shortTitle();

  Optional<Markdown> description();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Markdown> copyright();

  Optional<Date> lastReviewDate();

  Optional<Uri> url();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> subtitle();

  Optional<List<ContactDetail>> author();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<List<UsageContext>> useContext();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Date> approvalDate();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<ContactDetail>> endorser();

  Optional<Period> effectivePeriod();

  Optional<String> name();

  Optional<List<Reference>> exposureVariant();

  Optional<List<Reference>> outcome();

  Optional<String> title();

  Reference exposureBackground();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<List<ContactDetail>> contact();

  Optional<EvidenceStatus> status();

  Optional<List<ContactDetail>> reviewer();

  Optional<DateTime> date();

  static ImmutableEvidence.ResourceTypeBuildStage builder() {
    return ImmutableEvidence.builder();
  }
}
