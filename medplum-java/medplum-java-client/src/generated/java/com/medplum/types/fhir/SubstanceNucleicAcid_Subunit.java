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
    as = ImmutableSubstanceNucleicAcid_Subunit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceNucleicAcid_Subunit {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<SubstanceNucleicAcid_Sugar>> sugar();

  Optional<CodeableConcept> fivePrime();

  Optional<List<SubstanceNucleicAcid_Linkage>> linkage();

  Optional<CodeableConcept> threePrime();

  Optional<Integer> subunit();

  Optional<List<Extension>> modifierExtension();

  Optional<String> sequence();

  Optional<Attachment> sequenceAttachment();

  Optional<Integer> length();

  static ImmutableSubstanceNucleicAcid_Subunit.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Subunit.builder();
  }
}
