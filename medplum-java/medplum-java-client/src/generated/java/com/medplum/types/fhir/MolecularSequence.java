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
  Optional<Reference> patient();

  Optional<String> observedSeq();

  Optional<Quantity> quantity();

  Optional<List<Reference>> pointer();

  Optional<Meta> meta();

  Optional<MolecularSequence_ReferenceSeq> referenceSeq();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Reference> performer();

  Optional<List<Identifier>> identifier();

  Optional<List<MolecularSequence_Repository>> repository();

  Optional<Integer> coordinateSystem();

  Optional<List<MolecularSequence_Variant>> variant();

  Optional<Reference> device();

  Optional<Integer> readCoverage();

  Optional<List<MolecularSequence_Quality>> quality();

  Optional<List<MolecularSequence_StructureVariant>> structureVariant();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Reference> specimen();

  Optional<List<Extension>> modifierExtension();

  Optional<MolecularsequenceType> type();

  Optional<Id> id();

  static ImmutableMolecularSequence.ResourceTypeBuildStage builder() {
    return ImmutableMolecularSequence.builder();
  }
}
