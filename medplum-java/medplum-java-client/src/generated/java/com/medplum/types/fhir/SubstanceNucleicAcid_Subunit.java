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
  Optional<Integer> length();

  Optional<CodeableConcept> fivePrime();

  Optional<Attachment> sequenceAttachment();

  Optional<List<SubstanceNucleicAcid_Sugar>> sugar();

  Optional<String> sequence();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<SubstanceNucleicAcid_Linkage>> linkage();

  Optional<Integer> subunit();

  Optional<CodeableConcept> threePrime();

  static ImmutableSubstanceNucleicAcid_Subunit.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Subunit.builder();
  }
}
