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
  Optional<Narrative> text();

  Optional<List<MolecularSequence_Variant>> variant();

  Optional<Integer> readCoverage();

  Optional<List<MolecularSequence_StructureVariant>> structureVariant();

  Optional<MolecularsequenceType> type();

  Optional<Reference> performer();

  Optional<Reference> specimen();

  Optional<Quantity> quantity();

  String resourceType();

  Optional<Integer> coordinateSystem();

  Optional<List<MolecularSequence_Repository>> repository();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> pointer();

  Optional<Reference> device();

  Optional<String> observedSeq();

  Optional<Id> id();

  Optional<MolecularSequence_ReferenceSeq> referenceSeq();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> patient();

  Optional<Code> language();

  Optional<List<MolecularSequence_Quality>> quality();

  Optional<Meta> meta();

  static ImmutableMolecularSequence.ResourceTypeBuildStage builder() {
    return ImmutableMolecularSequence.builder();
  }
}
