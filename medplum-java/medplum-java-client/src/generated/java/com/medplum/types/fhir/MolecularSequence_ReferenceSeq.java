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
  Optional<String> genomeBuild();

  Optional<Integer> windowEnd();

  Optional<CodeableConcept> referenceSeqId();

  Optional<Reference> referenceSeqPointer();

  Optional<Integer> windowStart();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Molecularsequence_referenceseqStrand> strand();

  Optional<Molecularsequence_referenceseqOrientation> orientation();

  Optional<String> referenceSeqString();

  Optional<CodeableConcept> chromosome();

  static ImmutableMolecularSequence_ReferenceSeq.Builder builder() {
    return ImmutableMolecularSequence_ReferenceSeq.builder();
  }
}
