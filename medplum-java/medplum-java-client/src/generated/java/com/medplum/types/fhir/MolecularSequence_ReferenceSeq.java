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
    as = ImmutableMolecularSequence_ReferenceSeq.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_ReferenceSeq {
  Optional<CodeableConcept> referenceSeqId();

  Optional<String> id();

  Optional<Molecularsequence_referenceseqStrand> strand();

  Optional<Molecularsequence_referenceseqOrientation> orientation();

  Optional<CodeableConcept> chromosome();

  Optional<Integer> windowEnd();

  Optional<String> referenceSeqString();

  Optional<Reference> referenceSeqPointer();

  Optional<Integer> windowStart();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> genomeBuild();

  static ImmutableMolecularSequence_ReferenceSeq.Builder builder() {
    return ImmutableMolecularSequence_ReferenceSeq.builder();
  }
}
