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
    as = ImmutableSubstanceNucleicAcid_Subunit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceNucleicAcid_Subunit {
  Optional<List<SubstanceNucleicAcid_Linkage>> linkage();

  Optional<List<Extension>> extension();

  Optional<String> sequence();

  Optional<String> id();

  Optional<Integer> length();

  Optional<CodeableConcept> threePrime();

  Optional<Integer> subunit();

  Optional<CodeableConcept> fivePrime();

  Optional<List<Extension>> modifierExtension();

  Optional<Attachment> sequenceAttachment();

  Optional<List<SubstanceNucleicAcid_Sugar>> sugar();

  static ImmutableSubstanceNucleicAcid_Subunit.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Subunit.builder();
  }
}
