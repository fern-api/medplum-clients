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
  Optional<List<AdverseEvent_SuspectEntity>> suspectEntity();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Reference subject();

  Optional<DateTime> detected();

  Optional<CodeableConcept> severity();

  Optional<List<Reference>> referenceDocument();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> study();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> outcome();

  Optional<Code> language();

  String resourceType();

  Optional<Reference> recorder();

  Optional<DateTime> recordedDate();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> event();

  Optional<Reference> encounter();

  Optional<List<Reference>> contributor();

  Optional<AdverseeventActuality> actuality();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> resultingCondition();

  Optional<Identifier> identifier();

  Optional<Reference> location();

  Optional<List<Reference>> subjectMedicalHistory();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> seriousness();

  static ImmutableAdverseEvent.SubjectBuildStage builder() {
    return ImmutableAdverseEvent.builder();
  }
}
