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
    as = ImmutableMolecularSequence_ReferenceSeq.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_ReferenceSeq {
  Optional<Molecularsequence_referenceseqStrand> strand();

  Optional<Integer> windowStart();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> chromosome();

  Optional<Integer> windowEnd();

  Optional<Reference> referenceSeqPointer();

  Optional<String> id();

  Optional<String> genomeBuild();

  Optional<Molecularsequence_referenceseqOrientation> orientation();

  Optional<String> referenceSeqString();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> referenceSeqId();

  static ImmutableMolecularSequence_ReferenceSeq.Builder builder() {
    return ImmutableMolecularSequence_ReferenceSeq.builder();
  }
}
