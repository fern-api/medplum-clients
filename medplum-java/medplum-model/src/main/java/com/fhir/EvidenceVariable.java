package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableEvidenceVariable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EvidenceVariable {
  Optional<Narrative> text();

  Optional<uri> url();

  Optional<List<CodeableConcept>> topic();

  Optional<String> name();

  Optional<markdown> copyright();

  Optional<List<ResourceList>> contained();

  Optional<List<Annotation>> note();

  Optional<List<RelatedArtifact>> relatedArtifact();

  String resourceType();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> author();

  Optional<String> publisher();

  Optional<code> language();

  Optional<List<ContactDetail>> endorser();

  Optional<Meta> meta();

  Optional<EvidencevariableStatus> status();

  List<EvidenceVariable_Characteristic> characteristic();

  Optional<List<ContactDetail>> editor();

  Optional<String> shortTitle();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<dateTime> date();

  Optional<String> subtitle();

  Optional<date> lastReviewDate();

  Optional<Period> effectivePeriod();

  Optional<markdown> description();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<UsageContext>> useContext();

  Optional<List<Identifier>> identifier();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> contact();

  Optional<EvidencevariableType> type();

  Optional<String> title();

  Optional<date> approvalDate();

  static ImmutableEvidenceVariable.ResourceTypeBuildStage builder() {
    return ImmutableEvidenceVariable.builder();
  }
}
