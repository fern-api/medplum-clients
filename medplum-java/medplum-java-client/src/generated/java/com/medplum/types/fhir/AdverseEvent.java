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
  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  String resourceType();

  Optional<List<Reference>> resultingCondition();

  Optional<Identifier> identifier();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> study();

  Optional<List<AdverseEvent_SuspectEntity>> suspectEntity();

  Optional<List<CodeableConcept>> category();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Reference>> subjectMedicalHistory();

  Optional<Reference> encounter();

  Optional<DateTime> recordedDate();

  Optional<CodeableConcept> seriousness();

  Optional<Reference> recorder();

  Optional<CodeableConcept> severity();

  Optional<AdverseeventActuality> actuality();

  Optional<List<Extension>> extension();

  Optional<Reference> location();

  Optional<CodeableConcept> event();

  Reference subject();

  Optional<CodeableConcept> outcome();

  Optional<List<Reference>> referenceDocument();

  Optional<Narrative> text();

  Optional<List<Reference>> contributor();

  Optional<DateTime> detected();

  Optional<Code> language();

  static ImmutableAdverseEvent.ResourceTypeBuildStage builder() {
    return ImmutableAdverseEvent.builder();
  }
}
