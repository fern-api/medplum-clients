package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMolecularSequence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence {
  Optional<String> observedSeq();

  Optional<List<MolecularSequence_StructureVariant>> structureVariant();

  Optional<Reference> patient();

  Optional<List<MolecularSequence_Variant>> variant();

  Optional<Reference> performer();

  Optional<List<Reference>> pointer();

  Optional<Code> language();

  Optional<Quantity> quantity();

  Optional<List<MolecularSequence_Quality>> quality();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Integer> coordinateSystem();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Narrative> text();

  String resourceType();

  Optional<Reference> device();

  Optional<Integer> readCoverage();

  Optional<List<MolecularSequence_Repository>> repository();

  Optional<MolecularsequenceType> type();

  Optional<MolecularSequence_ReferenceSeq> referenceSeq();

  Optional<Reference> specimen();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  static ImmutableMolecularSequence.ResourceTypeBuildStage builder() {
    return ImmutableMolecularSequence.builder();
  }
}
