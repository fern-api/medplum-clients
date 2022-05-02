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
    as = ImmutableEvidenceVariable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EvidenceVariable {
  Optional<EvidencevariableType> type();

  Optional<List<Extension>> extension();

  Optional<EvidencevariableStatus> status();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> editor();

  Optional<List<ContactDetail>> author();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  List<EvidenceVariable_Characteristic> characteristic();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<String> version();

  Optional<Period> effectivePeriod();

  Optional<String> publisher();

  Optional<String> subtitle();

  Optional<Date> lastReviewDate();

  Optional<String> shortTitle();

  Optional<List<ContactDetail>> endorser();

  Optional<Uri> url();

  Optional<Markdown> description();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<String> title();

  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> topic();

  Optional<String> name();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<List<UsageContext>> useContext();

  Optional<Date> approvalDate();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  static ImmutableEvidenceVariable.ResourceTypeBuildStage builder() {
    return ImmutableEvidenceVariable.builder();
  }
}
