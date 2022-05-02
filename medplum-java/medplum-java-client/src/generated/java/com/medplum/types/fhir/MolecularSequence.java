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
  Optional<List<MolecularSequence_StructureVariant>> structureVariant();

  Optional<Narrative> text();

  Optional<MolecularSequence_ReferenceSeq> referenceSeq();

  Optional<List<Extension>> extension();

  Optional<Quantity> quantity();

  Optional<Reference> performer();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> device();

  Optional<MolecularsequenceType> type();

  Optional<List<MolecularSequence_Variant>> variant();

  Optional<Integer> readCoverage();

  Optional<List<Identifier>> identifier();

  Optional<Reference> patient();

  Optional<Integer> coordinateSystem();

  Optional<String> observedSeq();

  Optional<Meta> meta();

  Optional<List<Reference>> pointer();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<MolecularSequence_Quality>> quality();

  Optional<List<MolecularSequence_Repository>> repository();

  Optional<Id> id();

  Optional<Reference> specimen();

  Optional<Uri> implicitRules();

  static ImmutableMolecularSequence.ResourceTypeBuildStage builder() {
    return ImmutableMolecularSequence.builder();
  }
}
