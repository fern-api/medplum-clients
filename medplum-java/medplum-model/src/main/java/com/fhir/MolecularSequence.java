package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> modifierExtension();

  Optional<MolecularSequence_ReferenceSeq> referenceSeq();

  Optional<List<MolecularSequence_StructureVariant>> structureVariant();

  Optional<id> id();

  Optional<Reference> device();

  Optional<Quantity> quantity();

  Optional<Reference> specimen();

  Optional<Meta> meta();

  String resourceType();

  Optional<Integer> coordinateSystem();

  Optional<List<Extension>> extension();

  Optional<String> observedSeq();

  Optional<List<Identifier>> identifier();

  Optional<Integer> readCoverage();

  Optional<List<Reference>> pointer();

  Optional<code> language();

  Optional<List<MolecularSequence_Repository>> repository();

  Optional<MolecularsequenceType> type();

  Optional<List<ResourceList>> contained();

  Optional<Reference> patient();

  Optional<List<MolecularSequence_Variant>> variant();

  Optional<List<MolecularSequence_Quality>> quality();

  Optional<Narrative> text();

  Optional<Reference> performer();

  Optional<uri> implicitRules();

  static ImmutableMolecularSequence.ResourceTypeBuildStage builder() {
    return ImmutableMolecularSequence.builder();
  }
}
