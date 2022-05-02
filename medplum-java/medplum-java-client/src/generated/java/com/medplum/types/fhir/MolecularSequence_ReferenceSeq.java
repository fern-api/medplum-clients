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
  Optional<Molecularsequence_referenceseqOrientation> orientation();

  Optional<List<Extension>> extension();

  Optional<Integer> windowEnd();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> chromosome();

  Optional<String> id();

  Optional<Reference> referenceSeqPointer();

  Optional<String> genomeBuild();

  Optional<String> referenceSeqString();

  Optional<Molecularsequence_referenceseqStrand> strand();

  Optional<CodeableConcept> referenceSeqId();

  Optional<Integer> windowStart();

  static ImmutableMolecularSequence_ReferenceSeq.Builder builder() {
    return ImmutableMolecularSequence_ReferenceSeq.builder();
  }
}
