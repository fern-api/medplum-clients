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
    as = ImmutableAdverseEvent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AdverseEvent {
  Optional<Meta> meta();

  Optional<DateTime> date();

  Optional<List<Reference>> study();

  Optional<List<Reference>> resultingCondition();

  String resourceType();

  Optional<List<Reference>> contributor();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<List<AdverseEvent_SuspectEntity>> suspectEntity();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<CodeableConcept> seriousness();

  Optional<Reference> encounter();

  Optional<List<Reference>> subjectMedicalHistory();

  Optional<List<CodeableConcept>> category();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Reference subject();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> event();

  Optional<Reference> recorder();

  Optional<List<Reference>> referenceDocument();

  Optional<Reference> location();

  Optional<DateTime> recordedDate();

  Optional<CodeableConcept> outcome();

  Optional<CodeableConcept> severity();

  Optional<DateTime> detected();

  Optional<AdverseeventActuality> actuality();

  static ImmutableAdverseEvent.ResourceTypeBuildStage builder() {
    return ImmutableAdverseEvent.builder();
  }
}
