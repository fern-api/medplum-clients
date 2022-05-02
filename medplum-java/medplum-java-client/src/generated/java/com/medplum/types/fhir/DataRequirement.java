package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDataRequirement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement {
  Optional<List<DataRequirement_Sort>> sort();

  Optional<List<Canonical>> profile();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<DataRequirement_CodeFilter>> codeFilter();

  Optional<String> id();

  Optional<Reference> subjectReference();

  Optional<List<String>> mustSupport();

  Optional<Code> type();

  Optional<List<DataRequirement_DateFilter>> dateFilter();

  Optional<PositiveInt> limit();

  Optional<List<Extension>> extension();

  static ImmutableDataRequirement.Builder builder() {
    return ImmutableDataRequirement.builder();
  }
}
