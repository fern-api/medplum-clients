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
  Optional<CodeableConcept> severity();

  Optional<DateTime> date();

  Optional<Identifier> identifier();

  Optional<Reference> location();

  Optional<Uri> implicitRules();

  Optional<DateTime> detected();

  Optional<Code> language();

  Optional<List<Reference>> referenceDocument();

  Optional<CodeableConcept> event();

  Optional<CodeableConcept> outcome();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<CodeableConcept> seriousness();

  Optional<Id> id();

  Optional<Reference> recorder();

  Optional<DateTime> recordedDate();

  Optional<Narrative> text();

  Reference subject();

  Optional<Reference> encounter();

  Optional<List<AdverseEvent_SuspectEntity>> suspectEntity();

  Optional<List<Reference>> resultingCondition();

  Optional<List<Reference>> subjectMedicalHistory();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> study();

  Optional<List<CodeableConcept>> category();

  Optional<AdverseeventActuality> actuality();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> contributor();

  static ImmutableAdverseEvent.SubjectBuildStage builder() {
    return ImmutableAdverseEvent.builder();
  }
}
