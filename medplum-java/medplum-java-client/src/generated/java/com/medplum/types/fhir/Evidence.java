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
  Optional<List<ResourceList>> contained();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Markdown> copyright();

  Optional<Code> language();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> editor();

  Reference exposureBackground();

  Optional<String> title();

  Optional<Markdown> description();

  Optional<List<Reference>> exposureVariant();

  Optional<String> shortTitle();

  Optional<Id> id();

  Optional<List<Reference>> outcome();

  Optional<String> name();

  Optional<Date> approvalDate();

  Optional<EvidenceStatus> status();

  Optional<String> subtitle();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> topic();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> publisher();

  String resourceType();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> version();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<Annotation>> note();

  Optional<Date> lastReviewDate();

  Optional<Uri> url();

  Optional<DateTime> date();

  static ImmutableEvidence.ExposureBackgroundBuildStage builder() {
    return ImmutableEvidence.builder();
  }
}
