package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestScript_Teardown}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Teardown.builder()}.
 */
@Generated(from = "TestScript_Teardown", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Teardown implements TestScript_Teardown {
  private final List<TestScript_Action2> action;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableTestScript_Teardown(
      List<TestScript_Action2> action,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.action = action;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public List<TestScript_Action2> action() {
    return action;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestScript_Teardown#action() action}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Teardown withAction(TestScript_Action2... elements) {
    List<TestScript_Action2> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTestScript_Teardown(newValue, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestScript_Teardown#action() action}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of action elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Teardown withAction(Iterable<? extends TestScript_Action2> elements) {
    if (this.action == elements) return this;
    List<TestScript_Action2> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTestScript_Teardown(newValue, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Teardown#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Teardown withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Teardown(this.action, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Teardown#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Teardown withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Teardown(this.action, value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Teardown#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Teardown withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Teardown(this.action, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Teardown#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Teardown withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Teardown(this.action, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Teardown#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Teardown withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Teardown(this.action, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Teardown#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Teardown withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Teardown(this.action, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Teardown} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Teardown
        && equalTo((ImmutableTestScript_Teardown) another);
  }

  private boolean equalTo(ImmutableTestScript_Teardown another) {
    return action.equals(another.action)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code action}, {@code id}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + action.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Teardown} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Teardown{");
    builder.append("action=").append(action);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_Teardown", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Teardown {
    @Nullable List<TestScript_Action2> action = Collections.emptyList();
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("action")
    public void setAction(List<TestScript_Action2> action) {
      this.action = action;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public List<TestScript_Action2> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Teardown fromJson(Json json) {
    ImmutableTestScript_Teardown.Builder builder = ImmutableTestScript_Teardown.builder();
    if (json.action != null) {
      builder.addAllAction(json.action);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableTestScript_Teardown) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Teardown} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Teardown instance
   */
  public static TestScript_Teardown copyOf(TestScript_Teardown instance) {
    if (instance instanceof ImmutableTestScript_Teardown) {
      return (ImmutableTestScript_Teardown) instance;
    }
    return ImmutableTestScript_Teardown.builder()
        .addAllAction(instance.action())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Teardown TestScript_Teardown}.
   * <pre>
   * ImmutableTestScript_Teardown.builder()
   *    .addAction|addAllAction(com.fhir.types.fhir.TestScript_Action2) // {@link TestScript_Teardown#action() action} elements
   *    .id(String) // optional {@link TestScript_Teardown#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Teardown#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Teardown#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new TestScript_Teardown builder
   */
  public static ImmutableTestScript_Teardown.Builder builder() {
    return new ImmutableTestScript_Teardown.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Teardown TestScript_Teardown}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Teardown", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private long optBits;

    private final List<TestScript_Action2> action = new ArrayList<TestScript_Action2>();
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Adds one element to {@link TestScript_Teardown#action() action} list.
     * @param element A action element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAction(TestScript_Action2 element) {
      this.action.add(Objects.requireNonNull(element, "action element"));
      return this;
    }

    /**
     * Adds elements to {@link TestScript_Teardown#action() action} list.
     * @param elements An array of action elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAction(TestScript_Action2... elements) {
      for (TestScript_Action2 element : elements) {
        this.action.add(Objects.requireNonNull(element, "action element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link TestScript_Teardown#action() action} list.
     * @param elements An iterable of action elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAction(Iterable<? extends TestScript_Action2> elements) {
      for (TestScript_Action2 element : elements) {
        this.action.add(Objects.requireNonNull(element, "action element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Teardown#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Teardown#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Teardown#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Teardown#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Teardown#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Teardown#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Teardown TestScript_Teardown}.
     * @return An immutable instance of TestScript_Teardown
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Teardown build() {
      return new ImmutableTestScript_Teardown(createUnmodifiableList(true, action), id, extension, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Teardown is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
